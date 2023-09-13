package ua.com.chemerys.InterpolCardFile.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ua.com.chemerys.InterpolCardFile.entity.Criminal;
import ua.com.chemerys.InterpolCardFile.service.CriminalService;


@Controller
@RequestMapping("/criminals")
public class CriminalController {

    CriminalService criminalService;

    @Autowired
    public CriminalController(CriminalService criminalService) {
        this.criminalService = criminalService;
    }

    @GetMapping("/showCriminalRegistrationForm")
    public String showPageForAddCriminal(Model theModel) {

        theModel.addAttribute("criminal", new Criminal());

        return "criminals/criminal-registration-form";
    }

    @PostMapping("/processCriminalRegistrationForm")
    public String saveCriminal(@Valid @ModelAttribute("criminal") Criminal theCriminal,
                               BindingResult theBindingResult) {
        if (theBindingResult.hasErrors()) {
            return "criminals/criminal-registration-form";
        } else {
            criminalService.save(theCriminal);

            return "criminals/criminal-registration-confirmation";
        }
    }

    @GetMapping("/{id}")
    public String showCriminal(@PathVariable("id") int criminalId, Model theModel) {
        theModel.addAttribute("criminal", criminalService.findById(criminalId));
        return "criminals/criminal-show";
    }

    @GetMapping("/list")
    public String criminalsList(ModelMap modelMap,
                                @PageableDefault(size = 15) @SortDefault("familyName") Pageable pageable,
                                String nameKeyword) {
        Page<Criminal> page = criminalService.findAll(pageable);
        Page<Criminal> pageFilteredByNameKeyword = criminalService.findByNameKeyword(nameKeyword, pageable);

        if (nameKeyword != null) {
            modelMap.addAttribute("criminals", pageFilteredByNameKeyword);
        } else {
            modelMap.addAttribute("criminals", page);
        }
        return "criminals/criminal-list";
    }

    @GetMapping("/filteredList")
    public String criminalsFilteredList(ModelMap modelMap,
                                        @PageableDefault(size = 15) @SortDefault("familyName") Pageable pageable,
                                        String nameKeyword) {
        Page<Criminal> page = criminalService.findAll(pageable);

        modelMap.addAttribute("criminals", page);

        return "criminals/criminal-list-filtered";
    }

    @GetMapping("/delete")
    public String deleteCriminal(@RequestParam("criminalId") int theId) {

        // delete the criminal structure
        criminalService.deleteById(theId);

        //redirect to the /criminalStructures/list
        return "redirect:/criminals/list";
    }
}

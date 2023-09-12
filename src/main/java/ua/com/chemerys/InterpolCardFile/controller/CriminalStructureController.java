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
import ua.com.chemerys.InterpolCardFile.entity.CriminalStructure;
import ua.com.chemerys.InterpolCardFile.service.CriminalStructureService;

import java.util.List;

@Controller
@RequestMapping("/criminalStructures")
public class CriminalStructureController {

    CriminalStructureService criminalStructureService;

    @Autowired
    public CriminalStructureController(CriminalStructureService theCriminalStructureService) {
        this.criminalStructureService = theCriminalStructureService;
    }

    @GetMapping("/showCriminalStructureRegistrationForm")
    public String showPageForAddCriminalStructure(Model theModel) {

        theModel.addAttribute("criminalStructure", new CriminalStructure());

        return "criminal-structures/criminal-structure-registration-form";
    }

    @PostMapping("/processCriminalStructureRegistrationForm")
    public String saveCriminal(@Valid @ModelAttribute("criminalStructure") CriminalStructure theCriminalStructure,
                               BindingResult theBindingResult) {
        if (theBindingResult.hasErrors()) {
            return "criminal-structures/criminal-structure-registration-form";
        } else {
            criminalStructureService.save(theCriminalStructure);

            return "criminal-structures/criminal-structure-registration-confirmation";
        }
    }

    @GetMapping("/list")
    public String criminalStructuresList(Model theModel) {

        List<CriminalStructure> theCriminalStructure = criminalStructureService.findAll();

        theModel.addAttribute("criminalStructures", theCriminalStructure);

        return "criminal-structures/criminal-structures-list";
    }

    @GetMapping("/filteredList")
    public String criminalStructuresFilteredList(Model theModel) {
        List<CriminalStructure> theCriminalStructure = criminalStructureService.findAll();

        theModel.addAttribute("criminalStructures", theCriminalStructure);

        return "criminal-structures/criminal-structures-list-filtered";
}

    @GetMapping("/delete")
    public String deleteCriminalStructure(@RequestParam("criminalStructureId") int theId) {

        // delete the criminal structure
        criminalStructureService.deleteById(theId);

        //redirect to the /criminalStructures/list
        return "redirect:/criminalStructures/list";
    }
}

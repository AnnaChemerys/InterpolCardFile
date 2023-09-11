//package ua.com.chemerys.InterpolCardFile.servicestest;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import ua.com.chemerys.InterpolCardFile.entity.Criminal;
//import ua.com.chemerys.InterpolCardFile.exeption.ResourceNotFoundException;
//import ua.com.chemerys.InterpolCardFile.repository.CriminalRepository;
//import ua.com.chemerys.InterpolCardFile.service.CriminalServiceImpl;
//
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.BDDMockito.given;
//import static org.mockito.BDDMockito.willDoNothing;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class CriminalServiceTest {
//
//    @Mock
//    private CriminalRepository criminalRepository;
//
//    @InjectMocks
//    private CriminalServiceImpl criminalService;
//
//    private Criminal criminal;
//
//    @BeforeEach
//    public void setup() {
//        criminal = Criminal.builder()
//                .id(1)
//                .familyName("")
//                .forename("")
//                .alias("")
//                .build();
//    }
//
//    // JUnit test for saveEmployee method
//    @DisplayName("JUnit test for saveEmployee method")
//    @Test
//    public void givenEmployeeObject_whenSaveEmployee_thenReturnEmployeeObject() {
//        // given - precondition or setup
//        //ToDo
//        given(criminalRepository.findCriminalByAlias(criminal.getAlias()))
//                .willReturn(null);
//
//        given(criminalRepository.save(criminal)).willReturn(criminal);
//
//        System.out.println(criminalRepository);
//        System.out.println(criminalService);
//
//        // when -  action or the behaviour that we are going test
//        Criminal savedCriminal = criminalService.save(criminal);
//
//        System.out.println(savedCriminal);
//        // then - verify the output
//        assertThat(savedCriminal).isNotNull();
//    }
//
//    // JUnit test for saveEmployee method
//    @DisplayName("JUnit test for saveEmployee method which throws exception")
//    @Test
//    public void givenExistingEmail_whenSaveEmployee_thenThrowsException() {
//        // given - precondition or setup
//        //ToDo
//        given(criminalRepository.findCriminalByAlias(criminal.getAlias()))
//                .willReturn(criminal);
//
//        System.out.println(criminalRepository);
//        System.out.println(criminalService);
//
//        // when -  action or the behaviour that we are going test
//        org.junit.jupiter.api.Assertions.assertThrows(ResourceNotFoundException.class, () -> {
//            criminalService.save(criminal);
//        });
//
//        // then
//        verify(criminalRepository, never()).save(any(Criminal.class));
//    }
//
//    // JUnit test for findAll method
//    @DisplayName("JUnit test for findAll method")
//    @Test
//    public void givenEmployeesList_whenGetAllEmployees_thenReturnEmployeesList() {
//        // given - precondition or setup
//
//        Criminal criminal1 = Criminal.builder()
//                .id(2)
//                .familyName("Tony")
//                .forename("Stark")
//                .alias("ironman")
//                .build();
//
//        given(criminalRepository.findAll()).willReturn(List.of(criminal, criminal1));
//
//        // when -  action or the behaviour that we are going test
//        List<Criminal> criminalList = criminalService.findAll();
//
//        // then - verify the output
//        assertThat(criminalList).isNotNull();
//        assertThat(criminalList.size()).isEqualTo(2);
//    }
//
//    // JUnit test for findAll method
//    @DisplayName("JUnit test for findAll method (negative scenario)")
//    @Test
//    public void givenEmptyCriminalsList_whenFindAll_thenReturnEmptyCriminalsList() {
//        // given - precondition or setup
//
//        Criminal criminal1 = Criminal.builder()
//                .id(2)
//                .familyName("Tony")
//                .forename("Stark")
//                .alias("ironman")
//                .build();
//
//        given(criminalRepository.findAll()).willReturn(Collections.emptyList());
//
//        // when -  action or the behaviour that we are going test
//        List<Criminal> criminalsList = criminalService.findAll();
//
//        // then - verify the output
//        assertThat(criminalsList).isEmpty();
//        assertThat(criminalsList.size()).isEqualTo(0);
//    }
//
//    // JUnit test for getCriminalById method
//    @DisplayName("JUnit test for getCriminalById method")
//    @Test
//    public void givenEmployeeId_whenGetEmployeeById_thenReturnEmployeeObject() {
//        // given
//        given(criminalRepository.findById(1)).willReturn(Optional.of(criminal));
//
//        // when
//        Criminal savedCriminal = criminalService.findById(criminal.getId());
//
//        // then
//        assertThat(savedCriminal).isNotNull();
//
//    }
//
//    // JUnit test for updateCriminal method
//    @DisplayName("JUnit test for updateCriminal method")
//    @Test
//    public void givenEmployeeObject_whenUpdateEmployee_thenReturnUpdatedEmployee() {
//        // given - precondition or setup
//        given(criminalRepository.save(criminal)).willReturn(criminal);
//        criminal.setFamilyName("Angry");
//        criminal.setForename("Man");
//        // when -  action or the behaviour that we are going test
//        Criminal updatedCriminal = criminalService.update(criminal);
//
//        // then - verify the output
//        assertThat(updatedCriminal.getFamilyName()).isEqualTo("Angry");
//        assertThat(updatedCriminal.getForename()).isEqualTo("Man");
//    }
//
//    // JUnit test for deleteCriminal method
//    @DisplayName("JUnit test for deleteCriminal method")
//    @Test
//    public void givenEmployeeId_whenDeleteEmployee_thenNothing() {
//        // given - precondition or setup
//        int criminalId = 1;
//
//        willDoNothing().given(criminalRepository).deleteById(criminalId);
//
//        // when -  action or the behaviour that we are going test
//        criminalService.deleteById(criminalId);
//
//        // then - verify the output
//        verify(criminalRepository, times(1)).deleteById(criminalId);
//    }
//}
//}

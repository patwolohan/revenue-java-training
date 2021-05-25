package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.service.ScreeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TagTrainingSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TagTrainingSpringApplication.class, args);
        printWelcomeMessage();
    }

    private static void printWelcomeMessage() {
        System.out.println("\n" +
                "  _______       _____   _______        _       _             \n" +
                " |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
                "    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
                "    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
                "    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
                "    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
                "                                                        __/ |\n" +
                "                                                       |___/ \n");

        Patient joe = new Patient("Joe Brady", 1, LocalDate.of(1940, 1, 1), Gender.MALE);
        Patient john = new Patient("John Duffy", 2, LocalDate.of(1950, 1, 1), Gender.MALE);

        Screening screeningJoe = new Screening(10, joe, LocalDate.of(2021, 4, 24), true);
        Screening screeningJohn = new Screening(11, john, LocalDate.of(2021, 5, 24), false);
        ScreeningService screeningService = new ScreeningService();

        List<Screening> screeningList = new ArrayList<>();

        screeningList.add(screeningJoe);
        screeningList.add(screeningJohn);

for(Screening screening: screeningList){
    System.out.println("Patient: " + screening.getPatient().getName() + " has a malignant diagnosis of " + screening.isMalignant());
}



        //System.out.println("Patient: " + screeningJoe.getPatient().getName() + " has a malignant diagnosis of " + screeningJoe.isMalignant());
        //System.out.println("Patient: " + screeningJohn.getPatient().getName() + " has a malignant diagnosis of " + screeningJohn.isMalignant());
        System.out.println("Screening: " + screeningJoe.getScreeningId() + " has a match of " + screeningService.isPatientScreening(screeningJoe, joe) + " with patient " + joe.getName() );
        System.out.println("Screening: " + screeningJohn.getScreeningId() + " has a match of " + screeningService.isPatientScreening(screeningJohn, john) + " with patient " + john.getName() );
    }


}

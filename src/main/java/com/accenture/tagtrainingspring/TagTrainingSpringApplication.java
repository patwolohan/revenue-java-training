package com.accenture.tagtrainingspring;

//import com.accenture.tagtrainingspring.patient.Gender;
//import com.accenture.tagtrainingspring.patient.Patient;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;
import com.accenture.tagtrainingspring.screening.ScreeningService;
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
        //printlist();
        printService();
        //printFindScreening();
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
    }


    private static void printlist() {
        Patient joe = new Patient("Joe Brady", 1, LocalDate.of(1940, 1, 1), Gender.MALE);
        Patient john = new Patient("John Duffy", 2, LocalDate.of(1950, 1, 1), Gender.MALE);
        Patient mary = new Patient("Mary Reilly", 3, LocalDate.of(1960, 1, 1), Gender.FEMALE);
        Screening screeningJoe = new Screening(10, joe, LocalDate.of(2021, 4, 24), true);
        Screening screeningJohn = new Screening(11, john, LocalDate.of(2021, 5, 24), false);
        Screening screeningMary = new Screening(12, mary, LocalDate.of(2021, 5, 24), true);
        List<Screening> screeningList = new ArrayList<>();
        screeningList.add(screeningJoe);
        screeningList.add(screeningJohn);
        screeningList.add(screeningMary);
        for (Screening screeningx : screeningList) {
            System.out.println("Patient: " + screeningx.getPatient().getName() + " has a malignant diagnosis of " + screeningx.isMalignant());
        }
    }

    private static void printService() { // Task 3
        ScreeningDatabase screeningDatabase = new ScreeningDatabase();
        ScreeningService screeningService = new ScreeningService(screeningDatabase);
        List<Screening> screeningList = screeningService.getScreenings();
        /*for (Screening screeningx : screeningList) { // Java 6 for loop
            System.out.println("Patient: " + screeningx.getPatient().getName() + " has a malignant diagnosis of " + screeningx.isMalignant());
        }*/
        screeningList.forEach(screeningX -> System.out.println("Patient: " + screeningX.getPatient().getName() + " has a malignant diagnosis of " + screeningX.isMalignant()));
    }

    private static void printFindScreening() { //Extra Task
        ScreeningDatabase screeningDatabase = new ScreeningDatabase();
        ScreeningService screeningService = new ScreeningService(screeningDatabase);
        Screening screening = screeningService.findScreening("Mary Reilly");
        if (screening != null) {
            System.out.println("Patient: " + screening.getPatient().getName() + " has a malignant diagnosis of " + screening.isMalignant());
        } else {
            System.out.println("No Screening found");
        }
    }
}




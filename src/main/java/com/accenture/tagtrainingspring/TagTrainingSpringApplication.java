package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

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
        Patient patient = new Patient("Joe Brady", 1, LocalDate.of(1940, 1, 1), Gender.MALE);
        Screening screening = new Screening(10, patient, LocalDate.of(2021, 4, 24), true);


        System.out.println("Patient: " + screening.getPatient().getName() + " has a malignant diagnosis of " + screening.isMalignant());
        patient.setName("John Duffy");
        patient .setDateOfBirth(LocalDate.of(1965, 1, 1));
        System.out.println("Patient: " + screening.getPatient().getName() + " has a malignant diagnosis of " + screening.isMalignant());
    }


}

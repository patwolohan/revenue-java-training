package com.accenture.tagtrainingspring;

//import com.accenture.tagtrainingspring.patient.Gender;
//import com.accenture.tagtrainingspring.patient.Patient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
    }


}




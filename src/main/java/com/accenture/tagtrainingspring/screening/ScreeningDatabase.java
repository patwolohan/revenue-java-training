package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScreeningDatabase{


        public List<Screening> screenings() {

            Patient joe = new Patient("Joe Brady", 1, LocalDate.of(1940, 1, 1), Gender.MALE);
            Patient john = new Patient("John Duffy", 2, LocalDate.of(1950, 1, 1), Gender.MALE);
            Patient mary = new Patient("Mary Reilly", 3, LocalDate.of(1960, 1, 1), Gender.FEMALE);
            Patient debbie = new Patient("Debbie McGee", 4, LocalDate.of(1958, 1, 1), Gender.FEMALE);
            Patient cathy = new Patient("Cathy Browne", 5, LocalDate.of(1943, 1, 1), Gender.FEMALE);
            Patient bob = new Patient("Bob Browne", 6, LocalDate.of(1942, 1, 1), Gender.MALE);

            Screening screeningJoe = new Screening(10, joe, LocalDate.of(2021, 4, 24), true);
            Screening screeningJohn = new Screening(11, john, LocalDate.of(2021, 5, 24), false);
            Screening screeningMary = new Screening(12, mary, LocalDate.of(2021, 5, 24), true);
            Screening screeningBob = new Screening(32, bob, LocalDate.of(2021, 3, 15), true);
            Screening screeningCathy = new Screening(135, cathy, LocalDate.of(2021, 3, 15), false);
            Screening screeningDebbie = new Screening(302, debbie, LocalDate.of(2021, 4, 15), false);

            List<Screening> screeningList = new ArrayList<>();
            screeningList.add(screeningJoe);
            screeningList.add(screeningJohn);
            screeningList.add(screeningMary);
            screeningList.add(screeningDebbie);
            screeningList.add(screeningCathy);
            screeningList.add(screeningBob);


            return screeningList;
        }

    }

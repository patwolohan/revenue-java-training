package com.accenture.tagtrainingspring.service;

import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;

public class ScreeningService {

    public ScreeningService() {
    }

    public boolean isPatientScreening(Screening screening, Patient patient) {
        return screening.getPatient().getId().equals(patient.getId());
    }

}

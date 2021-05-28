package com.accenture.tagtrainingspring.screening;

import java.util.List;

public interface ScreeningDao {

    Screening get(Integer patientId);

    List<Screening> get();

    void save(Screening screening);

}

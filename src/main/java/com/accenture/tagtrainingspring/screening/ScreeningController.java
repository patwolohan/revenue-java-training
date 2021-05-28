package com.accenture.tagtrainingspring.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ScreeningController {

    @Autowired
    ScreeningDaoImpl screeningDao;

    @GetMapping("/screenings")
    public List<Screening> getScreening() {
        return screeningDao.get();
    }

    @GetMapping("/screenings/{id}")
    public Screening getScreening(@PathVariable int id) {
        return screeningDao.get(id);
    }

    @PostMapping("/screenings")
    public void createScreening(@RequestBody Screening screening) {
        screeningDao.save(screening);
    }
}

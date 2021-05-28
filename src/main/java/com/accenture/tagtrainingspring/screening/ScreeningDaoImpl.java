package com.accenture.tagtrainingspring.screening;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ScreeningDaoImpl implements ScreeningDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public Screening get(Integer patientId) {
        String sql = "select * from screening_results where id = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{patientId}, new ScreeningRowMapper());
        } catch (EmptyResultDataAccessException e) {
            log.info("No results found for patient id: " + patientId);
        }

        return null;
    }

    @Override
    public List<Screening> get() {
        String sql = "select * from screening_results";
        return jdbcTemplate.query(sql, new ScreeningRowMapper());
    }

    @Override
    public void save(Screening screening) {
        String sql = "insert into screening_results (id, diagnosis, symmetry_mean, group_id) values (?, ?, ?, ?)";
        jdbcTemplate.update(sql, screening.getId(), screening.getDiagnosis(), screening.getSymmetryMean(), screening.getGroupId());
    }

}

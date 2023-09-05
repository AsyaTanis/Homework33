package ru.skypro.lessons.springboot.spring3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.skypro.lessons.springboot.spring3.DTO.ReportDTO;
import ru.skypro.lessons.springboot.spring3.model.Report;

import java.io.IOException;
import java.util.Optional;


import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Integer> {

    @Query(value = "SELECT new ru.skypro.lessons.springboot.spring3.DTO.ReportDTO( " +
            "p.name, " +
            "count(e.id), " +
            "min(e.salary), " +
            "max(e.salary), " +
            "avg(e.salary)) " +
            "from Employee e join fetch Position p " +
            "where e.position = p " +
            "group by p.id")
    public List<ReportDTO> createReport();
}
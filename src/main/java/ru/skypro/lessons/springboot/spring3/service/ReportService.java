package ru.skypro.lessons.springboot.spring3.service;

import ru.skypro.lessons.springboot.spring3.model.Report;

import java.io.IOException;
import java.util.Optional;

public interface ReportService  {

    Integer createReport() throws IOException;

    Optional<Report> getReportById(int id);
}
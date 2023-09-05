package ru.skypro.lessons.springboot.spring3.service;

import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.spring3.model.Report;
import ru.skypro.lessons.springboot.spring3.repository.ReportRepository;

import java.io.IOException;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService{

    private final ReportRepository reportRepository;

    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public Integer createReport() throws IOException {

        Report report = new Report();
        report.setData(String.valueOf((reportRepository.createReport())));

        reportRepository.save(report);

        return report.getId();

    }

    @Override
    public Optional<Report> getReportById(int id) {

        return reportRepository.findById(id);
    }
}
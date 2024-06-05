package com.ganesh.service;

import com.ganesh.entity.CitizenPlan;
import com.ganesh.repo.CitizenPlanRepository;
import com.ganesh.request.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService{
    @Autowired
    private CitizenPlanRepository citizenPlanRepository;

    @Override
    public List<String> getPlanNames() {

        return null;
    }

    @Override
    public List<String> getPlanStatuses() {
        return null;
    }

    @Override
    public List<CitizenPlan> search(SearchRequest request) {
        return null;
    }

    @Override
    public boolean exportExcel() {
        return false;
    }

    @Override
    public boolean exportPdf() {
        return false;
    }
}

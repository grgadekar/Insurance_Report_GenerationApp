package com.ganesh.service;

import com.ganesh.entity.CitizenPlan;
import com.ganesh.request.SearchRequest;

import java.util.List;

public interface ReportService {
    //method to get Plan Name drop down data
    public List<String> getPlanNames();

    //method to get Plan Status drop down data
    public List<String> getPlanStatuses();

    // method to handle search functionality
    public List<CitizenPlan> search(SearchRequest request);

    //method to export data to excel file
    public boolean exportExcel();

    //method to export data to pdf file
    public boolean exportPdf();
}
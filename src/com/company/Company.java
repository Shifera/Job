package com.company;

public class Company {
    private String company;
    private String jobTitle;
    private int startDate;
    private int endDate;
    private String jobDescription;

    public Company() {

    }

    public Company(String company, String jobTitle, int startDate, String jobDescription) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.jobDescription = jobDescription;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void comp() {
        String comp;
        System.out.println("company " + " jobTitle " + " startDate " + " jobDescription");
    }

}

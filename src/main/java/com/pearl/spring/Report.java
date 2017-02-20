package com.pearl.spring;

/**
 * Created by muthuselvan on 2/19/17.
 */
public class Report {

    Integer reportID ;
    String methodName ;
    String className ;
    String reportType ;

    public Report(Integer reportID, String methodName, String className, String reportType) {
        this.reportID = reportID;
        this.methodName = methodName;
        this.className = className;
        this.reportType = reportType;
    }

    public Integer getReportID() {
        return reportID;
    }

    public void setReportID(Integer reportID) {
        this.reportID = reportID;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }





}

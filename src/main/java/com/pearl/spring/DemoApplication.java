package com.pearl.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import  org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@SpringBootApplication
@RestController
public class DemoApplication {

	private static HashMap<Integer,Report>  reportHashMap ;

	public static void main(String[] args) {
		updateReportList();
		SpringApplication.run(DemoApplication.class, args);
//		updateReportList();
	}

	@RequestMapping("/report")
	public Report getReportName(@RequestParam(name="report",required = true) Integer reportID) {
		System.out.println("Repor :" +reportID);

		return reportHashMap.get(reportID);
	}

	public static void updateReportList() {
		reportHashMap = new HashMap<>();
		for (int i=1;i<10;i++) {
			Report report = new Report(i,"A"+i,"B"+i,"D"+i);
			reportHashMap.put(i,report);

		}

	}

}

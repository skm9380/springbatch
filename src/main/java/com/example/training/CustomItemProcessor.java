package com.example.training;

import org.springframework.batch.item.ItemProcessor;

import com.training.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		System.out.println("Processing it .." + item);
		return item;
	}

}

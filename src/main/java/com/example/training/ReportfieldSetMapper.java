package com.example.training;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.training.model.Report;

public class ReportfieldSetMapper implements FieldSetMapper<Report> {
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public Report mapFieldSet(FieldSet fieldSet) throws BindException{
		Report report = new Report();
		report.setId(fieldSet.readInt(0));
		report.setSales(fieldSet.readBigDecimal(1));
		report.setQty(fieldSet.readInt(2));
		report.setStaffName(fieldSet.readString(3));
		
		String date = fieldSet.readString(4);
		
		try {
			report.setDate(dateFormat.parse(date));
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
		return report ; 
	}
	
}

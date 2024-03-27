package com.PDF_Handling;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class LoadingPDF {
	public void loadPDF() {
		var path = "F:\\Java Projects 2024\\ExcelToJson_Java\\PDF_Handling\\lib\\NewPDF.pdf";
		File file =new File(path);
		
		
		try {
			PDDocument doc = Loader.loadPDF(file);
			PDFTextStripper pdfStripper = new PDFTextStripper();
			var str = pdfStripper.getText(doc);
			
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

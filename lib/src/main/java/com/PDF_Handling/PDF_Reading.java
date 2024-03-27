package com.PDF_Handling;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


/*
 * pdf handing using apache pdfbox
 */

public class PDF_Reading {
	public void readPDF() {
		String path = "F:\\Java Projects 2024\\ExcelToJson_Java\\Test_PDF.pdf";
		
		File file = new File(path);
		
		try {
			PDDocument document = Loader.loadPDF(file);
			PDFTextStripper stripper = new PDFTextStripper();
			String text = stripper.getText(document);
			System.out.println(text);
			document.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

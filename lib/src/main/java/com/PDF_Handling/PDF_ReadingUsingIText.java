package com.PDF_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PDF_ReadingUsingIText {
	public void readPdf() {
		String path = "F:\\Java Projects 2024\\ExcelToJson_Java\\Test_PDF.pdf";
		File file = new File(path);
		try {
			FileInputStream is = new FileInputStream(file);
			PdfReader pdfReader = new PdfReader(is);
			int pages = pdfReader.getNumberOfPages();
			StringBuilder string = new StringBuilder();
			System.out.println(pages);
			for(int i=0;i<pages;i++) {
				StringBuilder temp = new StringBuilder();
				try {
					
					String str = PdfTextExtractor.getTextFromPage(pdfReader, i);
					System.out.println(str);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
//				string.append();
			}
			
			System.out.println(string.toString());
			pdfReader.close();
			
			
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}
}

package com.PDF_Handling;

public class PdfHandling {
	
	public static void main(String[] args) {
		System.out.println("PDF Handling with vedant");
//		PDF_Reading readPdf = new PDF_Reading();
//		System.out.println("Using Appache pdf box :- ");
//		readPdf.readPDF();
//		
//		System.out.println("Using iText PDF Reader :- ");
//		
//		PDF_ReadingUsingIText pdfItext = new PDF_ReadingUsingIText();
//		pdfItext.readPdf();
		
//		Creating Pdf
		
//		System.out.println("Creating Pdf with apache pdf");
//		CreatingPDF creatingPdf = new CreatingPDF();
//		creatingPdf.createPDF();
		
		LoadingPDF load = new LoadingPDF();
		load.loadPDF();
		
	}
}

package com.PDF_Handling;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName;

public class CreatingPDF {
	public void createPDF() {
		PDDocument document = new PDDocument();
		PDPage page = new PDPage();
		document.addPage(page);
		
		try {
			PDPageContentStream content = new PDPageContentStream(document, page);
			PDFont pdfFont=  new PDType1Font(FontName.COURIER);
			
			content.setFont(pdfFont, 12);
			content.beginText();
			content.newLineAtOffset(25, 700);
			
			content.showText("Hello test");
			content.endText();
			content.close();

			document.save("NewTestPDF.pdf");
			document.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

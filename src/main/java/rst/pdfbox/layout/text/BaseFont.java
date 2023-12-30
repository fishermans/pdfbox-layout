package rst.pdfbox.layout.text;

import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName;

/**
 * In order to easy handling with fonts, this enum bundles the
 * plain/italic/bold/bold-italic variants of the three standard font types
 * {@link PDType1Font#TIMES_ROMAN Times},{@link PDType1Font#COURIER Courier} and
 * {@link PDType1Font#HELVETICA Helvetica}.
 * 
 * @author Ralf
 *
 */
public enum BaseFont {

	Times(FontName.TIMES_ROMAN, FontName.TIMES_BOLD, FontName.TIMES_ITALIC, FontName.TIMES_BOLD_ITALIC),
	Courier(FontName.COURIER, FontName.COURIER_BOLD, FontName.COURIER_OBLIQUE, FontName.COURIER_BOLD_OBLIQUE),
	Helvetica(FontName.HELVETICA, FontName.HELVETICA_BOLD, FontName.HELVETICA_OBLIQUE, FontName.HELVETICA_BOLD_OBLIQUE);

	private PDFont plainFont;
	private PDFont boldFont;
	private PDFont italicFont;
	private PDFont boldItalicFont;

	private BaseFont(FontName plainFont, FontName boldFont, FontName italicFont, FontName boldItalicFont) {
		this.plainFont = new PDType1Font(plainFont);
		this.boldFont = new PDType1Font(boldFont);
		this.italicFont = new PDType1Font(italicFont);
		this.boldItalicFont = new PDType1Font(boldItalicFont);
	}

	public PDFont getPlainFont() {
		return plainFont;
	}

	public PDFont getBoldFont() {
		return boldFont;
	}

	public PDFont getItalicFont() {
		return italicFont;
	}

	public PDFont getBoldItalicFont() {
		return boldItalicFont;
	}

}

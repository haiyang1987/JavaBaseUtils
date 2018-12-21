package common.test;

import java.util.ArrayList;
import java.util.List;

import common.DocumentInfo;
import common.enums.FileTypeEnum;
import common.util.FileUtil;

public class UtilTest {

	public static void main(String[] args) throws Exception {
		DocumentInfo.createDocInfo();
		String filePath = "F://world.pdf";
		List<String> text = new ArrayList();
		text.add("         Episode 1         ");
		text.add("  Hello World!Welcome to my Codehouse!  ");
		// PDFUtils.createPdf(filePath, text);
		FileUtil.createFile(text, FileTypeEnum.MARKDOWN_FILE);
	}
}
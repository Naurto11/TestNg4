package org.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;

public class Runner_output extends BaseClass {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\TestNg4\\src\\notepad\\selenium_output.txt");


		String Output = "";
		for (int i = 1; i < 7; i++) {

			for (int j = 0; j < 1; j++) {
				// Output += excelRead(i, j) + "||";

				{

				}
			}

			for (int k = 0; k <= 0; k++) {

			//	Output += excelRead(i, k) + "||";

				for (int l = 2; l <= 2; l++) {

				//	Output += excelRead(i, l) + "||";
				}

			}

			for (int m = 5; m <= 5; m++) {

				Output += excelRead(i, m) + "||";

			}
			for (int n = 6; n <= 6; n++) {

				Output += excelRead(i, n) + "||";

			}

			Output += "\n";

			FileUtils.write(file, Output);

		}
		System.out.println("done");
	}
}

package org.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.pojo.LoginPojo;

public class Runner_TxtWriter extends BaseClass {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\TestNg4\\src\\test\\java\\TextWriter.txt");
		FileUtils.write(file, excelRead(1, 2), true);
//		FileUtils.write(file, "\n" + excelRead(1, 3), true);
//		FileUtils.write(file, "\n" + excelRead(1, 4), true);
//		FileUtils.write(file, "\n" + excelRead(1, 5), true);
//		FileUtils.write(file, "\n" + excelRead(1, 6), true);
//		FileUtils.write(file, "\n" + excelRead(1, 7), true);
//		FileUtils.write(file, "\n" + excelRead(2, 3), true);
//		FileUtils.write(file, "\n" + excelRead(2, 4), true);
//		FileUtils.write(file, "\n" + excelRead(2, 5), true);

		String stroutput = "";
		// Row for Loop
		for (int i = 1; i < 7; i++) {

			// FileUtils.write(file,"text"+i);

			// stroutput+="text"+i+"\n";
			// Column For loop
			for (int j = 0; j < 1; j++) {
			//	stroutput += excelRead(i, j) + "||";


				{

				}
			}

			for (int k = 0; k <= 0; k++) {

				stroutput += excelRead(i, k) + "||";

				for (int l = 2; l <= 2; l++) {

					stroutput += excelRead(i, l) + "||";
				}

			}

			for (int m = 5; m <= 5; m++) {

				stroutput += excelRead(i, m) + "||";

			}
			for (int n = 6; n <= 6; n++) {

				stroutput += excelRead(i, n) + "||";

			}

			stroutput += "\n";

			FileUtils.write(file, stroutput);

			
		}
		System.out.println("done");
	}
}
// FileWriter fw = new FileWriter(file);

// BufferedWriter write = new BufferedWriter(fw);
//String[] value= {excelRead(0, 1),excelRead(2, 1),excelRead(3, 3)};
//String[] value2= {excelRead(2, 1),excelRead(3, 2),excelRead(0, 1)};
//		
//		for (int i = 0; i < value2.length -1; i++) {
//			
//			
//		}
// write.write("Welcome JMS");
// write.newLine();
// write.write("test cases");

// write.newLine();

// write.write(excelRead(0, 1));
// writer.write(excelRead(row, cell));

//		write.close();

//		File fil=new File("C:\\Users\\Admin\\eclipse-workspace\\TestNg4\\src\\test\\java\\TextWriter.txt");
//		
//		FileReader r=new FileReader(fil);
//		
//		BufferedReader reader=new BufferedReader(r);
//		String s= null;
//		while ((s=reader.readLine()) !=null) {
//			
//			System.out.println(s);
//
//			
//		}
// reader.close();

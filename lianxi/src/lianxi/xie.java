package lianxi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class xie {
	public static void main(String[] args) {
		try {
			int a;
			int b;
			a = 1;
			b = 2;
			//定义变量
//			int a = 1;
//			int b = 1;
			
			// 运算操作
			// 1 - 1 = ?
			//
			int c = a + b;
			int d;
			
			String content = "This is the content to write into file\r\n这是writeinto文件内容";

			File file = new File("D:\\workspace\\learning\\WebContent\\lianxi\\xiewenjian.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

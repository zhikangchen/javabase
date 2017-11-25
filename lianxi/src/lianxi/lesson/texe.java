package lianxi.lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class texe {

	public static void main(String[] args) {
		readFileByChars("D:\\git\\lianxi\\lianxi\\src\\lianxi\\lesson\\czk.java");
	}

	public static void readFileByChars(String fileName) {
		File file = new File(fileName);
		Reader reader = null;
		try {
			if (file != null) {
				// 一次读多个字符
				char[] tempchars = new char[30];
				int charread = 0;
				reader = new InputStreamReader(new FileInputStream(fileName));
				// 读入多个字符到字符数组中，charread为一次读取字符数
				while ((charread = reader.read(tempchars)) != -1) {
					// 同样屏蔽掉\r不显示
					if ((charread == tempchars.length) && (tempchars[tempchars.length - 1] != '\r')) {
						System.out.print(tempchars);
					} else {
						for (int i = 0; i < charread; i++) {
							if (tempchars[i] == '\r') {
								continue;
							} else {
								System.out.print(tempchars[i]);
							}
						}
					}
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
					System.out.println("文件不存在");
				}
			}
		}
	}

}

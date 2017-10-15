package czk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class mulu {
	public static void main(String[] args) {
		readFile();
}

	private static void readFile() {
		// TODO Auto-generated method stub
		String path = "E:\\czk\\java\\czk.java";
		File f = new File(path);
		FileInputStream fis = null;
		try {
			//构造函数
			fis = new FileInputStream(f);
			
			byte[] b = new byte[1024];
			
			
			fis.read(b);
			
			String content = new String(b,"gbk");
			
			System.out.println(content);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	}
	public static void getFileName() {
		
		String path = "D:\\"; // 路径
		
		File f = new File(path);
		if (!f.exists()) {
			System.out.println(path + " not exists");
			return;
		}

		File fa[] = f.listFiles();
		for (int i = 0; i < fa.length; i++) {
			File fs = fa[i];
			if (fs.isDirectory()) {
				System.out.println(fs.getName() + " [目录]");
			} else {
				System.out.println(fs.getName());
			}
		}
	}
}

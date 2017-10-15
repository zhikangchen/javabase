package czk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class javahuoqumuluwenjian {
	//修饰符 公共的 静态的 
	//没有返回值 函数名称（参数类型 参数名）
	public static void main(String[] args) {
		readFile();
		//getFileName();
	}

	public static void readFile()  {
		String path = "D:\\JavaScript\\angular-1.5.9\\angular.min.js";
		File f = new File(path);
//		String path2 = f.getPath();
//		String name = f.getName();
//		System.out.println(name);
//		System.out.println(path2);
//		boolean isFile = f.isFile();
//		System.out.println(isFile);
//		boolean isDir = f.isDirectory();
//		System.out.println(isDir);
//		long len = f.length();
		
		//File Input Stream
		
		FileInputStream fis = null;
		try {
			//构造函数
			fis = new FileInputStream(f);
			
			byte[] b = new byte[1024];
			
			
			fis.read(b);
			
			String content = new String(b);
			
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
	
//		System.out.println(len);
	}
	public static void getFileName() {
		//D:\JavaScript\angular-1.5.9\angular.min.js
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

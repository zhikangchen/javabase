package czk;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class AppendToFileExample1 {
public static void main(String[] args) {
	try {
		String data = "内容是:This content will append to the end of the file";
		//定义一个字符串类型的变量data，把"内容是:This content will append to the end of the file"赋给data
		File file = new File("javaio-appendfile.txt");
		//定义一个文件类型的变量file,把创建的文件实例赋给file
		if(!file.exists()) {
			//如果文件不存在
			file.createNewFile();
			//那么创建一个新文件
		}
		FileWriter fileWriter = new FileWriter(file.getName(), false);
		//定义一个文件写变量fileWriter，把创建一个得到文件名的文件实例赋给fileWriter
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		//定义一个缓存的写变量bufferedWriter，把创建的文件实例赋给bufferedWriter
		bufferedWriter.write(data);
		//把缓存的内容写到文件里
		bufferedWriter.close();
		//然后结束
		System.out.println("Done");
	}
	catch (IOException e) {
		e.printStackTrace();
	}
}
}

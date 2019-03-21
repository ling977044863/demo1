package selenium_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.servlet.ServletOutputStream;
import javax.swing.plaf.synth.SynthEditorPaneUI;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.Zip;

public class dom6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", ".\\test\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		FileHandler.copy(new File("E:\\图片壁纸\\test1"),new File("E:\\图片壁纸\\test2"));//把xx文件下的所有文件复制到xx文件夹下
		//FileHandler.copy(new File("E:\\图片壁纸\\test1"),new File("E:\\图片壁纸\\test2"),".txt");
	   FileHandler.createDir(new File("E:\\图片壁纸\\test3"));//创建文件夹
	   FileHandler.copy(new File("E:\\图片壁纸\\test2"),new File("E:\\图片壁纸\\test3"),".txt");//复制特定的文件
	   FileHandler.delete(new File("E:\\图片壁纸\\test2\\123.txt"));//删除指定的文件
	   //第一种写入文件
	  // ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\图片壁纸\\test2\\456.txt"));//创建指定文件
	  // oos.writeObject("123456");//运用输入流写入文件
	   //第二种写入文件
	   FileOutputStream out=new FileOutputStream("E:\\图片壁纸\\test2\\456.txt");
	   String str="诶，儿子我是你爸爸！！";
	   //写入文件
	   byte []b=str.getBytes();
	   System.out.println(b.length);
	   for(int i=0;i<b.length;i++) {
		   
		   out.write(b[i]);
	   }
	   String file=FileHandler.readAsString(new File("E:\\图片壁纸\\test3\\123.txt"));
	   System.out.println(file);
	   String a="E:\\图片壁纸\\test2\\图片.zip";
	   Zip zip=new Zip();
	   try {
		   zip.zip(new File("E:\\图片壁纸\\test2\\123.jpg"),new File(a));
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  
	   
	}

}

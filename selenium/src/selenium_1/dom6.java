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
		
		FileHandler.copy(new File("E:\\ͼƬ��ֽ\\test1"),new File("E:\\ͼƬ��ֽ\\test2"));//��xx�ļ��µ������ļ����Ƶ�xx�ļ�����
		//FileHandler.copy(new File("E:\\ͼƬ��ֽ\\test1"),new File("E:\\ͼƬ��ֽ\\test2"),".txt");
	   FileHandler.createDir(new File("E:\\ͼƬ��ֽ\\test3"));//�����ļ���
	   FileHandler.copy(new File("E:\\ͼƬ��ֽ\\test2"),new File("E:\\ͼƬ��ֽ\\test3"),".txt");//�����ض����ļ�
	   FileHandler.delete(new File("E:\\ͼƬ��ֽ\\test2\\123.txt"));//ɾ��ָ�����ļ�
	   //��һ��д���ļ�
	  // ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\ͼƬ��ֽ\\test2\\456.txt"));//����ָ���ļ�
	  // oos.writeObject("123456");//����������д���ļ�
	   //�ڶ���д���ļ�
	   FileOutputStream out=new FileOutputStream("E:\\ͼƬ��ֽ\\test2\\456.txt");
	   String str="��������������ְ֣���";
	   //д���ļ�
	   byte []b=str.getBytes();
	   System.out.println(b.length);
	   for(int i=0;i<b.length;i++) {
		   
		   out.write(b[i]);
	   }
	   String file=FileHandler.readAsString(new File("E:\\ͼƬ��ֽ\\test3\\123.txt"));
	   System.out.println(file);
	   String a="E:\\ͼƬ��ֽ\\test2\\ͼƬ.zip";
	   Zip zip=new Zip();
	   try {
		   zip.zip(new File("E:\\ͼƬ��ֽ\\test2\\123.jpg"),new File(a));
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  
	   
	}

}

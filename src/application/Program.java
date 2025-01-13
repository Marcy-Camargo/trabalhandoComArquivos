package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//LISTAR SOMENTE QUEM FOR DIRETÓRIO/PASTA
		File[] folders = path.listFiles(File::isDirectory); 
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//LISTAR SOMENTE QUEM FOR ARQUIVO
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for (File file : files) {
			System.out.println(file);
		}
		
		// CRIAR UMA PASTA A PARTIR DO CAMINHO INFORMADO PELO USUÁRIO
		boolean success = new File(strPath + "\\subdir").mkdir(); 
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}
}
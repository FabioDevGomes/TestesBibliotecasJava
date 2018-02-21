package close.mult.exception;

import java.io.FileReader;

public class Teste {

	private static void instatiate(String className) throws Exception {
		try {
			Class<?> clazz = Class.forName(className);
			Object o = clazz.newInstance();
			System.out.println(o.getClass().getName());
		} catch (ClassNotFoundException e) {
			System.err.println("Classe não encontrada: " + className);
			throw e;
			//recuso novo no java 7
		} catch (InstantiationException | IllegalAccessException  e) {
			System.err.println("Não foi possivel instaciar a classe: " + className);
			throw e;
		} 
	}

	public static void main(String[] args) throws Exception {
		//recuso novo no java 7
		try (MyBufferedReader myBufferedReader = new MyBufferedReader(new FileReader("classes.txt"))) {
			String line;
			while ((line = myBufferedReader.readLine()) != null) {
				instatiate(line);
			}
		} 
	}

}

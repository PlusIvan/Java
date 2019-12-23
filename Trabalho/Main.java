
import java.nio.charset.Charset;
import java.util.*;
import java.util.Scanner;
import crypter.Crypt;
public class Main {
	
	
	
	private static Crypt crypter = new Crypt();
	
	
	
	/*
	public static Crypt crypter = new Crypt();
	public static Book book = new Book();
	public static Livraria library[] = new Livraria[3];
	static {
		   for(int i=0; i<library.length; i++)
			   library[i] = new Livraria();
		}
	static Categoria cat = null;
	static Categoria[] types = cat.values();
	
		public static void library() {
			
			
			//System.out.println("List: "+livros.length); 3
			System.out.println("Categories:"); 
		    for (Categoria strTemp : types){
		        System.out.println("["+strTemp+"]" + "\t"+(strTemp).url());
		        
		    }
		}
		
		public static void allBooks() {
		   /* for (Categoria strTemp : types){
		        System.out.println("["+strTemp+"]\n");
		        strTemp = strTemp.toString();
		        System.out.println(Biology.getLivros().length);
		       
		    }
			System.out.println("Book list:"); 
	        for (int i = 0; i < library.length; i++) { 
	        	  
	            
	        	for (String strTemp : library[i].getLivros()){
	        		System.out.println("Name: "+strTemp+"\t Category: "+library[i].getName());
	        		}
	        } 
			
			//System.out.println(Biology.getLivros()[0]);
		}
		*/
	public static void main(String[] args) throws Exception {
		
		
		Livraria atec = new Livraria("Atec", 5);
		
		atec.insereLivro("D7878FKJ45", "Vulcao", "Ivan Moroz", 6, 10, Categoria.BIOLOGY);
		atec.insereLivro("DFK6767J45", "WW2", "Hitler", 6, 10, Categoria.HISTORY);
		atec.insereLivro("DFKJ46765", "Bitcoin", "Ivan", 6, 10, Categoria.FINANCE);
		
		
		atec.editaLivro("DFKJ46765", "BITAURUS FTW");
		System.out.println(atec.toString());
		
		String crypted_text = crypter.encrypt(atec.getConteudo("DFKJ46765"), "IVANLOL");
		System.out.println(crypted_text);
		String decrypted_text = crypter.decrypt(crypted_text, "IVANLOL");
		System.out.println(decrypted_text);
		
		/*
		String encrypted = crypter.encrypt("NAVI","secret123");
		System.out.println("RAW IVAN ENCRYPTED: "+encrypted);
		String decrypted = crypter.decrypt(encrypted,"secret123");
		System.out.println("DECRYPT: "+decrypted);
		*/

		//Mount

		//library[0].setLivros(new String[]{"Vulcao"}, "BIOLOGY");
		//library[1].setLivros(new String[]{"History","WW2"},"HISTORY");
		//library[2].setLivros(new String[]{"Bitoin","Trading stocks","Bitaurus Era"},"FINANCE");
		/* for (int i = 0; i < library.length; i++) { 
	    	for (String strTemp : library[i].getLivros()){
	    		//strTemp name of book
	    		//library[i].getName()); category
	    	    byte[] array = new byte[7]; // length is bounded by 7
	    	    new Random().nextBytes(array);
	    	    String qq_isbn = new String(array, Charset.forName("UTF-8"));
	    	 
	    	   
	    		
	    		
	    	}
		 }*/
		//System.out.println(Biology.getCategoria(Biology.getName())); biology and science
		
/*
		library();
		System.out.println("-------------------");
		allBooks();
		System.out.println("-------------------");
		
		*/
		
	/*	while(true) {
			System.out.println("[1] Library\n[2] Books\n[3] Categories");
			Scanner input = new Scanner(System.in);
			int cmd = input.nextInt();
			if(cmd == 1) {
				library();
			}
				
			
			
			
			
		}
		*/
		
		//System.out.println(Biology.getCategoria());
		//System.out.println(library.getLivros().length);
		

		
		//System.out.println();

		
		
		
		
		
		
		
	}
}

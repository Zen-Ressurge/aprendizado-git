package application;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		
		//Object obj = x;
		Integer obj = x; // posso usar Integer no lugar de Object ent�o n�o precisarei de casting
		                 // Integer � uma classe de int 
		System.out.println(obj);
		
		int y = (int)obj;
		
		System.out.println(obj);
		
		int z = obj;
		
		System.out.println(obj);

	}

}

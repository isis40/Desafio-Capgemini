
public class Principal {

	public static void main(String[] args) {
		//cria String a valor do asterisco
		String a = "*";
		//faz com que os caracteres se ordenem de ordem crescente at� o 6�
		for(int n = 1; n <= 6; n++) {
			int loop = 0;
			while(loop < n) {
				System.out.print(a);
				loop++;
			}
			System.out.println();
			
		}
	}

}


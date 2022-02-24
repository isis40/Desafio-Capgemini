import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        //importa o scanner
		Scanner sc1 = new Scanner(System.in);
        //requisita a senha e passa o valor digitado para STRING
        System.out.println("Digite sua senha: ");
        String s = sc1.nextLine();
        //transforma o numero de caracteres da string em valor INT sem contar os espaços
        int senha_min2 = s.replace(" ", "").length();
        //lógica geral da senha calcula e calcula os caracteres restantes do que foi digitado
        if(senha_min2 >= 6) {
        	System.out.println("Senha cadastrada com sucesso!");
        }else {
        	int carRestante = 6 - senha_min2;
        	System.out.println("Senha Inválida!! \nMínimo de caracteres: 6 \n" + "Caracteres necessários: " + carRestante);
        }
	}

}

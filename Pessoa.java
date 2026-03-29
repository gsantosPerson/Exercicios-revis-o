package exercicios;

import java.util.Scanner;

public class Pessoa {
    private String nome;   
    private String login;
    private String senha;
    
    public Pessoa(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Pessoa(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public void ativarConta(){
        System.out.println("Conta ativa");
        System.out.println("Nome: "+this.nome);
        System.out.println("Login: "+this.login);
        System.out.println("Senha: "+this.senha);
    }
    public void ativarConta(String senha){
        this.senha = senha;
        System.out.println("Nova senha: "+senha);
    }
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gustavo", "gustavo123", "adm123");

        pessoa.ativarConta();

        System.out.println("Nova senha: ");
        Scanner input = new Scanner(System.in);

        String novaSenha = input.nextLine();
        
        pessoa.ativarConta(novaSenha);
        pessoa.ativarConta();

        input.close();
    }
}

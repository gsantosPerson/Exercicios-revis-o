public class Pessoa{
    private String nome;
    private String login;
    private String senha;
    private boolean status; 

    public Pessoa(String nome, String login, String senha, boolean status){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.status = status;
    }

    public Pessoa(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public void ativarConta(){
        this.status = true;
        if(this.status)
        System.out.println("Conta ativada");
    }

    public void ativarConta(String novaSenha){
        this.status = true;
        this.senha = novaSenha;
            System.out.println("Senha ativada com nova senha");
    }

    public static void main(String[]args){
        Pessoa pessoa = new Pessoa("Gustavo", "gustavo123", "adm123", false);
        pessoa.ativarConta();
        pessoa.ativarConta("adm456");
        
    }   
}   
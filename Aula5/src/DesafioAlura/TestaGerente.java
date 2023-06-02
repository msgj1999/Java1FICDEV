package DesafioAlura;

public class TestaGerente {
    public static void main(String[] args) {
        //falta alguns exemplos
        Gerente gerente = new Gerente();
        gerente.setNome("João da Silva");
        gerente.setSenha(4231);
        
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Bonificação: " + gerente.getBonificacao());
        
        Funcionario funcionario = new Gerente();
        funcionario.setNome("Maria Souza");
        funcionario.setSalario(3000.0);
        
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Bonificação: " + funcionario.getBonificacao());
    }
}
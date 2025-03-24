import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        List<Pessoa> pessoas = new ArrayList<>(); //lista para armazenar as pessoas  
        boolean existePessoa = false; //variavel para ver se tem pessoas cadastradas  
        
        
        while (true) {
            //menu
            System.out.println("1 - Cadastrar uma nova pessoa");
            System.out.println("2 - Editar dados de uma pessoa cadastrada");
            System.out.println("3 - Exibir os dados de uma pessoa cadastrada");
            System.out.println("4 - Excluir os dados de uma pessoa cadastrada");
            System.out.println("0 - Sair");
            
            //escolher opção
            System.out.print("Escolha uma opção: "); 
            int opcao = scanner.nextInt();
            scanner.nextLine(); //limpar o buffer

            switch (opcao) {
                case 1:
                    //criar nova pessoa  
                    System.out.print("Digite o nome: ");  
                    String nome = scanner.nextLine();  
                    System.out.print("Digite a idade: ");  
                    int idade = scanner.nextInt();
                    scanner.nextLine(); //limpar o buffer 
                    System.out.print("Digite o email: ");  
                    String email = scanner.nextLine();

                    Pessoa pessoa = new Pessoa(nome, idade, email);
                    pessoas.add(pessoa); //adiciona a nova pessoa a lista de pessoas 
                    System.out.println("Pessoa criada: " + pessoa);  
                    existePessoa = true; //muda a variavel despois de criar uma pessoa
                
                    break;
                case 2:
                    //editar pessoa
                    if (existePessoa) {  
                        System.out.println("Selecione o índice da pessoa que você deseja alterar:");  
                        for (int i = 0; i < pessoas.size(); i++) {  
                            System.out.println(i + ": " + pessoas.get(i));  
                        }  
                        int indice = scanner.nextInt();
                        scanner.nextLine(); //limpar o buffer   

                        if (indice >= 0 && indice < pessoas.size()) {  
                            Pessoa pessoaParaAlterar = pessoas.get(indice);  
                            
                            //pedindo novas informações  
                            System.out.print("Digite o novo nome (atual: " + pessoaParaAlterar.getNome() + "): ");  
                            String novoNome = scanner.nextLine();  
                            System.out.print("Digite a nova idade (atual: " + pessoaParaAlterar.getIdade() + "): ");  
                            int novaIdade = scanner.nextInt();
                            scanner.nextLine(); //limpar o buffer    
                            System.out.print("Digite o novo email (atual: " + pessoaParaAlterar.getEmail() + "): ");  
                            String novoEmail = scanner.nextLine();  
                            
                            //atualiazando os atributos da pessoa  
                            pessoaParaAlterar.setNome(novoNome);  
                            pessoaParaAlterar.setIdade(novaIdade);  
                            pessoaParaAlterar.setEmail(novoEmail);  
                            
                            System.out.println("Informações atualizadas: " + pessoaParaAlterar);  
                        } else {  
                            System.out.println("Índice inválido! Tente novamente.");  
                        }  
                    } else {  
                        System.out.println("Nenhuma pessoa cadastrada. Crie uma nova pessoa primeiro.");  
                    }

                    break;
                case 3:
                    //exibir pessoas  
                    if (existePessoa) {  
                        System.out.println("Lista de Pessoas:");  
                        for (Pessoa p : pessoas) {  
                            System.out.println(p);  
                        }  
                    } else {  
                        System.out.println("Nenhuma pessoa cadastrada. Crie uma nova pessoa primeiro.");  
                    }
                    break;
                case 4:
                    //excluir uma pessoa  
                    if (existePessoa) {  
                        System.out.println("Selecione o índice da pessoa que você deseja excluir:");  
                        for (int i = 0; i < pessoas.size(); i++) {  
                            System.out.println(i + ": " + pessoas.get(i));  
                        }  
                        int indice = scanner.nextInt();  
                        scanner.nextLine(); //limpar o buffer  

                        if (indice >= 0 && indice < pessoas.size()) {  
                            Pessoa pessoaParaExcluir = pessoas.remove(indice); //remove a pessoa da lista  
                            System.out.println("Pessoa excluída: " + pessoaParaExcluir);  
                            //verifica se a lista ficou vazia  
                            if (pessoas.isEmpty()) {  
                                existePessoa = false; //atualiza a variável  
                            }  
                        } else {  
                            System.out.println("Índice inválido! Tente novamente.");  
                        }  
                    } else {  
                        System.out.println("Nenhuma pessoa cadastrada. Crie uma nova pessoa primeiro.");  
                    }   
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close();
                    break;
            
                default: 
                    System.out.println("Opção inválida... Tente novamente");
                    break;
            }
            
        }
            
    }
        
}

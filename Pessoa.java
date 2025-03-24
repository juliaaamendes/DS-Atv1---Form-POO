public class Pessoa {
    private String nome;
    private int idade;
    private String email;

//construtor
public Pessoa (String nome, int idade, String email){
    this.nome = nome; 
    this.idade = idade;
    this.email = email;
}

//metodo get
public String getNome(){
    return nome;
}

public int getIdade(){
    return idade;
}

public String getEmail(){
    return email;
}

//metodo set
public void setNome(String nome){
    this.nome = nome;
}

public void setIdade(int idade){
    this.idade = idade;
}

public void setEmail(String email){
    this.email = email;
}

//metodo para exibir informações
public void exibirInformacao(){
    System.out.println("Nome: " + nome + "/ Idade: " + idade + "/Email: " + email);
}

//metodo para representar a pessoa como string  
public String toString() {  
    return "Nome: " + nome + ", Idade: " + idade + ", Email: " + email;  
} 
}


package login;
import java.util.Scanner;
public class Painel {
    public static final String Ler = null;
    public static String nome;
    public static String senha;
    public static Scanner ler = new Scanner(System.in);
    
    //programa que leia o nome do usuario e a idade e verifique se ele tem idade para criar uma conta       
    public static void usuario(){
            System.out.println("Digite o nome de usuario: ");
            System.out.print("- >");
            nome = ler.nextLine();
            if(nome.length()!=6){
                System.out.println("o nome tem que ter no minimo e maximo 6 caracteres");
                usuario();
            }
            if(nome == null || nome.isEmpty()){
                System.err.print("nao pode ter espaçaos");
                System.out.print("digite novamente:");
                usuario();
            }
            System.out.println("digite sua idade ");
            int idade = ler.nextInt();
            ler.nextLine();
                if(idade < 18){
                    System.out.println("voce nao tem idade para criar uma conta");
                    menu();
                }
                else if(idade >= 18){
                    System.out.println("Bem vindo " + nome);
                    verificar();   
                 }
                 else{
                    System.out.print("digite sua idade corretamente");
                    usuario();
                 }
        }  
                 //pogama que leia a senha do usuario e verifique se ela tem 8 caracteres
        public static void verificar(){
        System.out.println(nome + ", digite uma senha com 8 caracteres (espaçamento não será considerado):");
        System.out.print("- > ");
        senha  = ler.nextLine();
        senha = senha.trim().replace(" ", "");
        
        if(senha.length() != 8){
            while(senha.length() < 8 || senha.length() > 8){
            System.out.println("a senha tem que ter no minimo 8 e no maximo 8 caracteres");
            System.out.print("- > ");
            senha = ler.nextLine(); 
            senha = senha.trim().replace(" ", "");}}
        else if(senha.length() == 8){
            System.out.println("senha criada com sucesso");
            menu();
        } 
    
    
       
    }
      //menu para acessar o programa ou sair do programa
        public static void menu(){
        System.out.println("digite\n1 para cadastrar:\n2 para sair:\npara logar digite 3 ");
        System.out.print("- >");
        String aba = ler.nextLine();
        while(!aba.equals("1") && !aba.equals("2") && !aba.equals("3")){
            System.out.println("opção inválida");
            System.out.print("- > ");
            aba = ler.nextLine();
        }
        switch(aba){
            case "1":
                System.out.println("Bem vido\nperencha os campos para realizar o cadastro");
                usuario();
                break;
            case "2":
                System.out.println("saindo do menu...");
                System.exit(0);
                break;
            case "3":
                System.out.println("bem vindo de volta ");
                Login.logar();
                break;

        }
    
    }
    }


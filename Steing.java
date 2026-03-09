
import java.util.Scanner;
public class Steing {
    static Scanner ler = new Scanner(System.in);
    static String senha;
    static String nome;
    public static void main(String[] args) {
       menu();
       //usuario();
       //verificar();
    }
     //programa que leia o nome do usuario e a idade e verifique se ele tem idade para criar uma conta       
    static void usuario(){
            System.out.println("Digite seu nome: ");
            nome = ler.nextLine();
            System.out.println("digite sua idade ");
            int idade = ler.nextInt();
            ler.nextLine();
                if(idade < 18){
                    System.out.println("voce nao tem idade para criar uma conta");
                    System.exit(0);
                }
                else if(idade >= 18){
                    System.out.println("Bem vindo " + nome);
                    verificar();
                }

        }
         //pogama que leia a senha do usuario e verifique se ela tem 8 caracteres
        static void verificar(){
        System.out.println(nome + ", digite uma senha com 8 caracteres (espaçamento não será considerado):");
        System.out.print("- > ");
        senha  = ler.nextLine();
        senha = senha.trim().replace(" ", "");
        
        if(senha.length() != 8){
            while(senha.length()< 8 || senha.length()> 8){
            System.out.println("a senha tem que ter no minimo 8 e no maximo 8 caracteres");
            System.out.print("- > ");
            senha = ler.nextLine(); 
            senha = senha.trim().replace(" ", "");
        if(senha.length() == 8){
            System.out.println("senha criada com sucesso");
        } }

        }
       
    }

    //menu para acessar o programa ou sair do programa
        static void menu(){
        System.out.println("digite 1 para acessar o menu ou 2 para sair: ");
        String aba = ler.nextLine();
        while(!aba.equals("1") && !aba.equals("2")){
            System.out.println("opção inválida");
            System.out.print("- > ");
            aba = ler.nextLine();
        }
        switch(aba){
            case "1":
                System.out.println("Bem vindo ao menu ");
                usuario();
                break;
            case "2":
                System.out.println("saindo do menu...");
                System.exit(0);
                break;
        }
    
    }
    }
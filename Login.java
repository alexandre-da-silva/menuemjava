package login;
public class Login {
    //programa que leia o nome do usuario e a senha e verifique se eles estão corretos para realizar o login
    public static void logar(){
        System.out.println("digite seu nome de ussuario: ");
        String nomever = Painel.ler.nextLine();
        //criar aqui depois um if para saber se o nome do ussuario e igual oque ele registouuu


        //
        //esse if ta errado, ele em "tese" verifica se tem ussuario cadastrado e se o nome ta vaziu 
        if(nomever == null || nomever.isEmpty() || !nomever.equals(Painel.nome)|| Painel.nome == null || Painel.nome.isEmpty()){
            System.out.println("ussuario nao encontrado.");
            System.out.println("1: para voltar ao menu.");
            System.out.println("2: para sair.");
            System.out.println("3: para tentar novamente");
            System.out.print("- >");
            String veri = Painel.ler.nextLine();
            switch(veri){
                case "1":
                    Painel.menu();
                    break;
                case "2":
                    System.out.println("saindo...");
                    break;
                default:
                    while(!veri.equals("1")&& !veri.equals("2")){
                    System.out.println("informaçao invalida");
                    System.out.println("digite novamente (menu:1)(sair:2)");
                    System.out.print("- >");
                    veri = Painel.ler.nextLine();
                    if (veri.equals("1")) {
                        Painel.menu();
                        break;
                    }
                    if (veri.equals("2")) {
                        System.out.println("saindo...");
                        break;
                    }
                    if (veri.equals("3")) {
                        logar();
                        
                    }}
                     break;
                case "3":
                    logar();
            }
            

        }
        if (nomever.equals(Painel.nome)){
            System.out.println("digite sua senha: ");
            String senhaver = Painel.ler.nextLine();
            if (Painel.senha == null || Painel.senha.isEmpty()){
                while(!senhaver.equals(Painel.senha)){
                System.out.println("senha incorreta tente novamente");
                System.out.print("- >");
                senhaver = Painel.ler.nextLine();
            }}
            if(!senhaver.equals(Painel.senha) && !nomever.equals(Painel.nome)){
                while(!senhaver.equals(Painel.senha) && !nomever.equals(Painel.nome)){
                System.out.print("erro de login\ntente novamente");
                 System.out.println("digite seu nome de ussuario: ");
                 nomever = Painel.ler.nextLine();
                 senhaver = Painel.ler.nextLine();
                if(senhaver.equals(Painel.senha) && nomever.equals(Painel.nome)){
                    System.out.println("login realizado com sucesso");
                } 
            }

            }
            else{
                System.out.print("login realizado com sucesso" + "\nseja bem vindo " + Painel.nome);
            }

        }
    }
}

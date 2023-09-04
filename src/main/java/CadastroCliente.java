import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = null;
        String email = null;
        String regex =  "^(.+)@(\\S+)$"; //regex de email @tst.com
        Boolean acessoNegado = true; //validação de acesso.

        System.out.println("""
            ===================================
            Seja Bem vindo ao Login ADERA!""");

      while(acessoNegado){
          System.out.println("""
            Informe o seu E-mail:""");
          email = sc.nextLine(); //Solicitando o email

          //validando o email para que não seja null e que tenha a regex de email
          if(email.matches(regex) && email != null){
              System.out.println("Informe sua Senha:");
              senha = sc.nextLine();
              System.out.println("===================================");

              //validando para que a senha não seja null
              if(senha != null ){
                  System.out.println("Bem vindo ao ambiente ADERA!");
                  acessoNegado = false;
              }
              else{
                  System.out.print("Senha invalida!\n");
              }


          }
          else{
              System.out.print("E-mail invalido!\n\n");
          }
      }

    }
}

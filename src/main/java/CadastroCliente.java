import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario[] listaUsuarios = {
                new Usuario("emyli12silva@gmail.com", "123456"),
                new Usuario("dener17Mauro@outlook.com", "769087"),
                new Usuario("douglas@aditum.com", "789898"),
                new Usuario("arthur@gmail.com", "123456")
        };

        String senha = null;
        String email = null;
        Integer tentativas = 5;
        Boolean acessoNegado = true; //validação de acesso.

        System.out.println("""
                ===================================
                Seja Bem vindo ao Login ADERA!""");

        while (acessoNegado) {

            if (tentativas.equals(0)) {
                System.out.println("Muitas tentativas erradas! Procure o time de suporte para mais informações.");
                break;
            } else {

                System.out.println("""
                        Informe o seu E-mail:""");
                email = sc.nextLine(); //Solicitando o email


                for (int i = 0; i < listaUsuarios.length; i++) {
                    if (email.equals(listaUsuarios[i].email)) {

                        while (senha != listaUsuarios[i].senha) {
                            System.out.println("Informe sua Senha:");
                            senha = sc.nextLine();
                            System.out.println("===================================");

                            //validando para que a senha não seja null
                            if (senha.equals((listaUsuarios[i].senha))) {
                                System.out.println("Bem vindo ao ambiente ADERA!");
                                acessoNegado = false;
                                break;
                            } else {
                                System.out.print("Senha invalida!\n");

                            }
                        }


                    }

                }
                tentativas = tentativas - 1;
            }
        }

    }

}


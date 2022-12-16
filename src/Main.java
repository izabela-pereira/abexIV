
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Impressora impressoras[] = new Impressora[4];
        Scanner scan = new Scanner(System.in);

        boolean continua = true;
        while (continua == true){

            System.out.println("--------------------------------------");
            System.out.println("BEM VINDO AO CONTROLADOR DE IMPRESSORAS!");
            System.out.println("-------------------------------------- \n");
            System.out.println("(1) - Cadastro de impressora.");
            System.out.println("(2) - Listar informaÃ§Ãµes de uma impressora.");
            System.out.println("Digite o nÃºmero que representa o que deseja fazer: ");
            Random contador = new Random();
            contador.nextBoolean();
            boolean cont;
            cont = false;
            cont = contador.nextBoolean();
            int total;
            total = 0;

            if (cont == true){
                total = total + 1;
            }

            int n = scan.nextInt();
            switch(n){
                case 1:
                    for (int i = 0; i< 4; i++) {
                        Scanner lerStr = new Scanner (System.in);
                        Scanner lerFloat = new Scanner (System.in);
                        System.out.println("Digite o nome do produto " + (i+1)+ ":");
                        String nome;
                        nome = lerStr.nextLine();

                        System.out.println("Digite o nÃºmero de sÃ©rie da impressora " + (i+1) + ":");
                        float numero = 0;
                        numero = lerFloat.nextFloat();
                        impressoras[i] = new Impressora (nome, numero);
                    }

                    break;

                case 2:
                    for (int i = 0; i< 4; i++) {
                        System.out.println("Nome da impressora:" + impressoras[i].getNome());
                        System.out.println("NÃºmero de sÃ©rie da impressora: " + ": " + impressoras[i].getNuserie() + "\n");
                        Scanner lerNuserie = new Scanner (System.in);
                        float serie = 0;
                        System.out.println("Digite o nÃºmero de sÃ©rie da impressora que deseja obter informaÃ§Ãµes: \n");
                        serie = lerNuserie.nextFloat();
                        System.out.println("NÃºmero total de impressÃµes:" + total);
                        System.out.println("NÃºmero total de cÃ³pias:");
                        System.out.println("NÃºmero total de digitalizaÃ§Ãµes:");
                    }
                    break;

                default:
                    System.out.println("OpÃ§Ã£o invÃ¡lida!");
            }


            System.out.println("Deseja fazer outra operaÃ§Ã£o? Digite 1 para Sim e 2 para NÃ£o");
            int continuar = scan.nextInt();
            if (continuar != 1){
                continua = false;

            }
        }
    }
}

    
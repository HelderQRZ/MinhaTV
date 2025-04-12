import java.util.Scanner;

public class MinhaTV {

    public static int receberLiga(Scanner sc) {
        System.out.println("TV Desligada \n" +
                "Tecle 1 para ligar a TV");
        int opcaoLigar = sc.nextInt();
        return opcaoLigar;
    }

    public static int comandarTV(Scanner com) {
        System.out.println("\n" + "# Digite a opçao desejada # \n" + "\n" +
                "1. Off\n" +
                "2. + volume\n" +
                "3. - volume\n" +
                "4. + Canal\n" +
                "5. - Canal\n");
        int comandos = com.nextInt();
        return comandos;
    }


    public static void main(String[] args) {

        boolean statusTV = false;
        int volume = 7;
        int canal = 1;

        // Ligando a TV
        while (statusTV == false) {

            Scanner sc;
            sc = new Scanner(System.in);
            int numero = receberLiga(sc);

            if (numero == 1) {
                statusTV = true;
                System.out.print("# TV Ligada #");
            }
        }


        // Comandos
        while (statusTV == true) {
            Scanner com = new Scanner(System.in);
            int comandoEscolhido = comandarTV(com);
            switch (comandoEscolhido) {
                case 1:
                    statusTV = false;
                    System.out.print("# TV Desligada #");
                    break;

                case 2:
                    if (volume < 10) {
                        volume++;
                        System.out.println("Volume: " + volume);
                    } else {
                        System.out.println("Volume: " + volume);
                    }
                    break;

                case 3:
                    if (volume > 0) {
                        volume--;
                        System.out.println("Volume: " + volume);
                    } else {
                        System.out.println("Volume: " + volume);
                    }
                    break;

                case 4:
                    if (canal < 10) {
                        canal++;
                        System.out.println("Canal: " + canal);
                    } else {
                        System.out.println("Canal: " + canal);
                    }
                    break;

                case 5:
                    if (canal > 1) {
                        canal--;
                        System.out.println("Canal: " + canal);
                    } else {
                        System.out.println("Canal: " + canal);
                    }
                    break;


            }


        }

    }

}


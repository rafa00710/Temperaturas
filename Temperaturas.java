package Shadow;

import java.util.Scanner;

public class Temperaturas {


    public static void main(String[] args) {

     float Celsius, Fahrenheit, Kelvin, Reaumur, Rankine;


        Scanner menu = new Scanner(System.in);



        while (true) {

            System.out.print("       Shadow.Temperaturas          \n\n");
            System.out.print("|----------------------------|\n");
            System.out.print("| Opção 1 - Kelvin           |\n");
            System.out.print("| Opção 2 - Réaumur          |\n");
            System.out.print("| Opção 3 - Rankine          |\n");
            System.out.print("| Opção 4 - Fahrenheit       |\n");
            System.out.print("| Opção 5 - Sair             |\n");
            System.out.print("|----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 5) {
                System.out.print("\nAté logo!");
                menu.close();
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("\nConverta e exiba em Kelvin (K)\n");
                    System.out.print("Digite a temperatura em Celsius: ");
                    Celsius = menu.nextFloat();

                    Kelvin = (Celsius + 273.15f);


                    System.out.print("\n A medida convertida é " + Kelvin + "ºK\n");
                    break;

                case 2:
                    System.out.print("\nConverta e exiba em Réaumur (Re)\n");
                    System.out.print("Digite a temperatura em Celsius: ");
                    Celsius = menu.nextFloat();

                    Reaumur = (Celsius * 0.8f);

                    System.out.print("\n A medida convertida é " + Reaumur + "ºRe\n");
                    break;

                case 3:
                    System.out.print("\nConverta e exiba em Rankine (Ra)\n");
                    System.out.print("Digite a temperatura em Celsius: ");
                    Celsius = menu.nextFloat();

                    Rankine = (Celsius * 1.8f + 32f + 459.67f);

                    System.out.print("\n A medida convertida é " + Rankine + "ºRa\n");
                    break;

                case 4:
                    System.out.print("\nConverta e exiba em Fahrenheit (F)\n");
                    System.out.print("Digite a temperatura em Celsius: ");
                    Celsius = menu.nextFloat();

                    Fahrenheit = (Celsius * 1.8f + 32f);

                    System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
                    break;

                default:
                    System.out.print("\nOpção Inválida!");
                    break;


            }
        }
    }
}

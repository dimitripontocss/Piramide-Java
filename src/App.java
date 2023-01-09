import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Escolha seu número:");

            int number = Integer.parseInt(myObj.nextLine());

            for (int cont = 1; cont < number + 1; cont++) {
                String linha = "";
                for (int chars = 1; chars <= cont; chars++) {
                    linha += cont;
                }
                System.out.println(linha);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
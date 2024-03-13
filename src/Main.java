import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


    System.out.println("Insert Tare: " );
        Scanner sc = new Scanner(System.in);
        int tare = sc.nextInt();
            sc.close();
        System.out.println("----------------------------------");
        System.out.println("-" + tare);
        System.out.println("Produto: " );
        System.out.println("Peso em KG");
        System.out.println("Preço");
        System.out.println("-------------------------------------");
        }

}
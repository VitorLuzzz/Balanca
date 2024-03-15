import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        System.out.println("Insert Tare: ");
        Scanner sc = new Scanner(System.in);
        int tare = sc.nextInt();
        System.out.println("Digite o Código: ");
        int codigoDePesagem = sc.nextInt();

        String code = null;
        if (codigoDePesagem == 120) {
            code = "Passarinho";
        }
        sc.close();

        System.out.println("----------------------------------");
        System.out.println("-" + tare);
        System.out.println("Produto: " + code);
        System.out.println("Peso em KG");
        System.out.println("Preço");
        System.out.println("-------------------------------------");
    }

}
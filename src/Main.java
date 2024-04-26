import java.util.Scanner;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        Produtos produto = new Produtos();
        produto.setName("Galinho");
        produto.setPrice(11.50);

        System.out.println("Insert Tare: ");
        Scanner sc = new Scanner(System.in);
        int tare = sc.nextInt();
        System.out.println("Digite o Código: ");
        int codigoDePesagem = sc.nextInt();

        String code = null;
        if (codigoDePesagem == 120) {
            code = "Passarinho";
        }
        /*try{
            if(codigoDePesagem == )
        }
       // if(codigoDePesagem != ) */
        sc.close();


        Date date = new Date();
        System.out.println("----------------------------------");
        System.out.println("Date: " +date);
        System.out.println("-" + tare);
        System.out.println("Produto: " + produto.getName());
        System.out.println("Peso em KG:" + produto.getPrice());
        System.out.println("Preço");
        System.out.println("-------------------------------------");
    }

}
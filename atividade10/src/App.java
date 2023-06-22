import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float temp_c;
        float temp_f;
        System.out.printf("Informe a temperatura em Celsius: ");
        temp_c = ler.nextFloat();
        temp_f = ((temp_c*9/5)+32);
        System.out.println("São " + temp_f + "F");
    }
}

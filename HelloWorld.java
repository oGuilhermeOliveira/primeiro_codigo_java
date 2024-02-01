public class HelloWorld {
    
    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")) {
            System.out.print("Executando em DEV");
        } else if (ambiente.equalsIgnoreCase("TESTE")) {
            System.out.print("Executando de TEST");
        } else {
            System.out.print(ambiente);
        }
    }
}
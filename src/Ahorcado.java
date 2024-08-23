import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivina = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        
        }

        

        while (!palabraAdivina && intentos < intentosMaximos) {
            
            System.out.flush();

            System.out.println("PISTA: La palabra tiene " + palabraSecreta.length() + " letras");

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            
            System.out.print("Introduce una letra, por favor: ");

            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {

                if (palabraSecreta.charAt(i) == letra) {

                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    
                }
                
            }
            if (!letraCorrecta) {
                
                intentos++;
                System.out.println(" ¡Incorrecto! Te quedan: " + (intentosMaximos - intentos + " intentos"));
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                
                palabraAdivina = true;
                System.out.println("¡FELICIDADES! Has adivinado la palabra secreta" + palabraSecreta);
                
            }
        }
        if (!palabraAdivina) {
            System.out.println("Te quedaste sin intentos amiguito");
        }

        scanner.close();
    }
}

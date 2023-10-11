import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Pedir datos para el primer objeto Estudiante
       System.out.println("Ingrese el nombre del primer estudiante:");
       String nombre1 = scanner.nextLine();
       System.out.println("Ingrese la edad del primer estudiante:");
       int edad1 = scanner.nextInt();
       scanner.nextLine(); // Limpiar el buffer
       System.out.println("Ingrese el sexo del primer estudiante (H o M):");
       char sexo1 = scanner.nextLine().charAt(0);
       System.out.println("Ingrese la matrícula del primer estudiante:");
       String matricula1 = scanner.nextLine();
       System.out.println("Ingrese el peso del primer estudiante:");
       double peso1 = scanner.nextDouble();
       System.out.println("Ingrese la altura del primer estudiante:");
       double altura1 = scanner.nextDouble();

       Estudiante estudiante1 = new Estudiante(nombre1, edad1, matricula1, sexo1, peso1, altura1);
    
       scanner.nextLine();
       System.out.println("Ingrese el nombre del segundo estudiante:");
       String nombre2 = scanner.nextLine();
       System.out.println("Ingrese la edad del segundo estudiante:");
       int edad2 = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Ingrese el sexo del segundo estudiante (H o M):");
       char sexo2 = scanner.nextLine().charAt(0);

        Estudiante estudiante2 = new Estudiante(nombre2, edad2, sexo2);
        double peso2 = 60;
        estudiante2.setPeso(peso2);
        double altura2 = 1.6;
        estudiante2.setAltura(altura2);

        int imc1 = estudiante1.calcularIMC();
        String mensajeIMC1 = (imc1 == -1) ? "Infrapeso" : (imc1 == 0) ? "Peso ideal" : "Sobrepeso";
        boolean esMayorDeEdad1 = estudiante1.esMayorDeEdad();
        System.out.println("Los resultados del primer estudiante son:");
        System.out.println("El estado de su IMC:"+mensajeIMC1);
        System.out.println("Es mayor de edad "+esMayorDeEdad1);
        System.out.println(estudiante1.toString());



        int imc2 = estudiante2.calcularIMC();
        String mensajeIMC2 = (imc2 == -1) ? "Infrapeso" : (imc2 == 0) ? "Peso ideal" : "Sobrepeso";
        boolean esMayorDeEda2 = estudiante1.esMayorDeEdad();
        System.out.println("Los resultados del segundo estudiante son:");
        System.out.println("El estado de su IMC:"+mensajeIMC2);
        System.out.println("Es mayor de edad "+ esMayorDeEda2);
        System.out.println(estudiante2.toString());

    }
}
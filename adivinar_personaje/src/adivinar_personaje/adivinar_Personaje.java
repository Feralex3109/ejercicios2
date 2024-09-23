package adivinar_personaje;
import java.util.Scanner;

public class adivinar_Personaje { 
    public static void main(String[] args) { 
        System.out.println("Intentar adivinar el personaje que escojas del siguiente listado: ");
        System.out.println("Contesta Si/No"); 
        System.out.println("1. Radamel Falcao Garcia");
        System.out.println("2. Goku");
        System.out.println("3. Michael Jordan");
        System.out.println("4. Eminem");
        System.out.println("5. Darth Vader");
        System.out.println("6. Adam Sandler");
        System.out.println("7. Bruce Wayne");
        System.out.println("8. Tin Tin");
        System.out.println("9. Ayudante de Santa");
        System.out.println("10. Joe Biden");
        System.out.println("11. Jose Saramago");
        System.out.println("12. Gunter Grass");
        System.out.println("13. Kim Jong Un");
        System.out.println("");
        System.out.println("Empecemos...!");

        try {
            Thread.sleep(3000);  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner teclado = new Scanner(System.in);  
        String respuesta;  

        System.out.println("¿Tu personaje es ficticio?");
        respuesta = teclado.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("¿El personaje tiene varias transformaciones?");
            respuesta = teclado.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("¡Es Goku!");
            } else {
                System.out.println("¿Es millonario?");
                respuesta = teclado.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.println("¡Es Bruce Wayne!");
                } else {
                    System.out.println("¿Es una mascota?");
                    respuesta = teclado.nextLine();
                    if (respuesta.equalsIgnoreCase("si")) {
                        System.out.println("¡Es el Ayudante de Santa!");
                    } else {
                        System.out.println("¿Tu personaje es un reportero?");
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("si")) {
                            System.out.println("¡Es Tin Tin!");
                        } else {
                            System.out.println("¡Es Darth Vader!");
                        }
                    }
                }
            }
        } else {
            System.out.println("¿Tu personaje es deportista?");
            respuesta = teclado.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("¿Es futbolista?");
                respuesta = teclado.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.println("¡El deportista es Radamel Falcao García!");
                } else {
                    System.out.println("¡Es Michael Jordan!");
                }
            } else {
                System.out.println("¿Es escritor?");
                respuesta = teclado.nextLine();
                if (respuesta.equalsIgnoreCase("si")) {
                    System.out.println("¿Es de nacionalidad portuguesa?");
                    respuesta = teclado.nextLine();
                    if (respuesta.equalsIgnoreCase("si")) {
                        System.out.println("¡Es José Saramago!");
                    } else {
                        System.out.println("¡Es Günter Grass!");
                    }
                } else {
                    System.out.println("¿Es presidente?");
                    respuesta = teclado.nextLine();
                    if (respuesta.equalsIgnoreCase("si")) {
                        System.out.println("¿Es norcoreano?");
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("si")) {
                            System.out.println("¡Es Kim Jong Un!");
                        } else {
                            System.out.println("¡Es Joe Biden!");
                        }
                    } else {
                        System.out.println("¿Tu personaje es un cantante?");
                        respuesta = teclado.nextLine();
                        if (respuesta.equalsIgnoreCase("si")) {
                            System.out.println("¡Es Eminem!");
                        } else {
                            System.out.println("¡Es Adam Sandler!");
                        }
                    }
                }
            }
        }

        teclado.close();  
    }
}


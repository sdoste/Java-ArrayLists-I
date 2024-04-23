import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // ArrayList <String> listaFruta = new ArrayList<String>();

        // listaFruta.add("Melon");
        // listaFruta.add("Fresa");
        // listaFruta.add("Sandía");
        // listaFruta.add("Pera");

        // //READ
        // System.out.println(listaFruta.get(1));
        // System.out.println(listaFruta);
        // System.out.println("La longitud del ArrayList es " + listaFruta.size());
        // for(int i = 0; i < listaFruta.size(); i++){
        //     System.out.println(listaFruta.get(i));
        // }


        // //UPDATE
        // listaFruta.set(3, "Mandarina");
        // System.out.println(listaFruta);

        // //DELETE
        // listaFruta.remove(1);
        // System.out.println(listaFruta);
        // listaFruta.clear();


        // 1.Crear un arraylist mediante un bucle con los números del 20 al 50.
        // Mostrar después todo el contenido del arraylist final.
        ArrayList <Integer> numeros = new ArrayList<Integer>();
        for (int i = 20; i <= 50; i++){
            numeros.add(i);
        }
        System.out.println(numeros);

        // Preguntar al usuario elementos típicos de la fiesta de Sant Jordi.
        // Para acabar, escribir 'salir'. Al final, mostrar todos los elementos introducidos por el usuario.
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> santJordiElements = new ArrayList<String>();
        String userInput = "";
        while (!userInput.equals("salir")){
            System.out.println("Dime un elemento típico de la fiesta de San Jordi. Escribe 'salir' para salir");
            userInput = teclado.nextLine();
            if (!userInput.equals("salir")){santJordiElements.add(userInput);}
        }
        System.out.println(santJordiElements);
        teclado.close();

        // Primer contacto extraterrestre. Lista con cinco elegid@s.
        ArrayList<String> elegidos = new ArrayList<String>();
        elegidos.add("Filomeno");
        elegidos.add("Ramón");
        elegidos.add("Cristina");
        elegidos.add("Martina");
        elegidos.add("Bernardo");
        System.out.println("Elegidos:" + elegidos);
        System.out.println("");
        
        System.out.println("se dan de baja el 2 y 3. Timothy en el puesto 2");
        elegidos.set(1, "Thimothy");
        elegidos.remove(2);
        System.out.println(elegidos);

        System.out.println("El último se enferma. Entra Gerardo");
        elegidos.set(elegidos.size()-1, "Gerardo");
        System.out.println(elegidos);

        System.out.println("Se añade un sexto participante, Dario");
        elegidos.add("Dario");
        System.out.println(elegidos);

    }
}

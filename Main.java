package Control;

public class Main {


    // Ejercicio 3: Resolver expresion matem�tica
    public static double resolverEcuacion(double x, double y) {
        // TODO Auto-generated method stub
        return((x*x)+((((4.0*y)/5.0)-x)*(((4.0*y)/5.0)-x)));
    }


    public static void main(String[] args) {

//		Write a method in Java that resolves this mathematical expression where x and y are two variables pre-set in your code.

        // Ejercicio 3: Resolver expresion matem�tica
        for (double x = -10000; x < 10000; x++) {
            for (double y = -10000; y < 10000; y++) {

                if(resolverEcuacion(x,y)==0.0) {
                    System.out.println("x="+x+", y="+y);
                    System.out.println(resolverEcuacion(x,y));
                }
            }
        }
    }
}


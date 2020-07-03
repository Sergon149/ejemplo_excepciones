package com.ejemplo;

public class Main {

    public static void main(String[] args) {
        // Atención, aunque aparezcan textos en rojo, el programa se ejecuta correctamente ya que "Process finished with exit code 0".
        // El texto rojo es lo que se escribe cuando haces un .printStackTrace()
        // El texto rojo no se ejecuta de manera

        // Si quitas los comentarios y ejecutas el código verás, una excepción de tipo NullPointerException sin tratar.
        // Integer myIntNull = null;
        // myIntNull++;

        handlingNullException();

        try {
            throwingNullException();
        } catch (NullPointerException exception){
            System.out.println("Error capturado en Main. El error recibido es:");
        }

        handlingNumberFormatException();

        handlingNullExceptionWithFinally();
    }

    public static void handlingNullException(){
        try{
            Integer myIntNull = null;
            myIntNull++;
        } catch (NullPointerException exceptionNull){
            System.out.println("handlingNullException. El error recibido es:");
            // Esto escribe el error en la consola
            System.out.println(exceptionNull.toString());
            // Esto escribe el error en rojo.
            exceptionNull.printStackTrace();
        }
    }

    public static void throwingNullException() throws NullPointerException{
        Integer myIntNull = null;
        myIntNull++;
    }

    public static void handlingNumberFormatException(){
        // Esto funciona correctamente. Transforma un String en número si se puede.
        String texto;
        try {
            texto = "1";
            Integer.parseInt(texto);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Este texto no va a aparecer");
        }

        try {
            texto = "Hola";
            Integer.parseInt(texto);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("numberFormatException. El error recibido es:");
            // Esto escribe el error en la consola
            System.out.println(numberFormatException.toString());
            // Esto escribe el error en rojo.
            numberFormatException.printStackTrace();
        }
    }

    public static void handlingNullExceptionWithFinally(){
        try{
            Integer myIntNull = null;
            myIntNull++;
        } catch (NullPointerException exceptionNull){
            System.out.println("handlingNullException. El error recibido es:");
            // Esto escribe el error en la consola
            System.out.println(exceptionNull.toString());
            // Esto escribe el error en rojo.
            exceptionNull.printStackTrace();
        } finally {
            System.out.println("Este texto se ejecuta siempre, haya excepción o no.");
        }
    }

}

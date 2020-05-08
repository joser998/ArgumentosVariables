/*/
 Los argumentos variables sirve para mandar x cantidad de argumentos a un metodo, el metodo no es necesario que especifique
  la cantidad que seran, basta con escribir en el argumento int...numeros y con esto indicamos que estos pueden variar
  y no existe la necesidad de estar cambiando el numero de los parametros que se reciben.

  Para que esto pueda funcionar es necesario que este argumento variable sea el ultimo argumento que se este mandando 
    en la llamada del metodo, de cualquier otra forma no funcionara, debe de ser como se muestra en el ejemplo:
 */
public class ArgumentosVariables {
    public static void main(String[] args) {
      /*Argumentos enviados a metodo impresion, puede cambiar tamaño de argumentos y no es necesario cambiar el tamaño 
            del arreglo */
     impresion(12,2,56,93,10);  
     
     impresionVariosArgs("Jose Luis", true, 12,63,99,55);
     
    }

    public static void impresion(int...numeros) {
        //Imprimimos todos los argumentos enviados desde el main hacia este metodo.
        System.out.println("Todos los numeros son: ");
        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]);
        }
    }
    
    public static void impresionVariosArgs(String miNombre, boolean bandera, int...numeros){
        System.out.print(miNombre);
        System.out.print(bandera);
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
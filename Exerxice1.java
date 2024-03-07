//1 
public class SumaArray {
    public static void main(String[] args) {
      
        int[] array = {15, 6, 3, 4, 3};
        
        
        int suma = sumaArray(array);
        System.out.println("La suma de los elementos del array es: " + suma);
    }
    
 
    public static int sumaArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
}

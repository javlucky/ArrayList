package arraylistint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListInt {

    public static void main(String[] args) {
        ArrayList numeros = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int num;
       boolean s;
        do  {
            System.out.println("Ingrese un número: ");
            
            num = entrada.nextInt();
                    
            System.out.println("¿Desea ingrear otro número? s/n");
            
            s = entrada.nextBoolean();
            
        }while (s = true);        
        
        
//        numeros.add(25);
//        numeros.add(50);
//        numeros.add(13);
//        numeros.add(8);
//        numeros.add(21);
        int m;  
        m = (int) numeros.get(0);
        for (int i = 0; i <numeros.size(); i++) {
            int mm;  
            mm = (int) numeros.get(i);
            if (i>0 ){
              if (m>mm){
                    m=m;
                            
                    
                
            }    
              else
                            m=mm;  
        }
            
                        
        }
         System.out.println("El número mayor es: " +m);
       
        Iterator i = numeros.iterator();
			while(i.hasNext()) {
			System.out.println(i.next());
 		}
                        
    }
    
}

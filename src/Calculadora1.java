/**
 *
 * @author Ingles
 */
import java.util.Scanner;

public class Calculadora1 {
    
    double a;
    double b;
    double suma;
    double resta;
    double multi;
    double dividir;
    
    public void Pedir_datos(){
    
        Scanner sc= new Scanner(System.in);//creo objeto de clase Scanner
        
        System.out.print("Ingrese 1er numero: ");
        a=sc.nextDouble();
        System.out.print("Ingrese 2do numero: ");
        b =sc.nextDouble();    
    
    }    
    
    public void Sumar(){
    
        suma=a+b;
    }
    
    public void Restar(){
    
        resta=a-b;
    }
    
    public void Multiplicacion(){
   
        multi=a*b;
    }
    
    public void Dividir(){
        
        if (b>0){
            dividir=a/b;
        } 
        else{
            System.out.println("La division por 0 no es posible");
        }        
    }
    
    public void Mostrar(){
    
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multi);
        System.out.println("El resultado de la división es: "+ dividir);
    }
    
    
    public static void main(String[] args){
    
        Calculadora1 dato= new Calculadora1();
    
        dato.Pedir_datos();
        dato.Sumar();
        dato.Restar();
        dato.Multiplicacion();
        dato.Dividir();
        dato.Mostrar();
    
        /*if(b==0){
            System.out.println("Error");
        }
        else{
            dato.Dividir(a,b);
        }*/
            
    
    }
    
}

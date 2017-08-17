/**
 *
 * @author Ingles
 */
import java.util.Scanner;

public class Calculadora {
    
    int num1;
    int num2;
    int suma=0;
    int resta=0;
    //int multi=0;
    
    public void Pedir_datos(int a, int b){
    
        //Scanner sc= new Scanner(System.in);//creo objeto de clase Scanner
        
        //System.out.print("Ingrese 1er numero: ");
        num1= a;
        //System.out.print("Ingrese 2do numero: ");
        num2= b;
        
    
    }
    public void Sumar(){
    
        suma=num1+num2;
    }
    
    public void Restar(){
    
        resta=num1-num2;
    }
    
    /*public void Multiplicacion(int num1, int num2){
    
        multi=num1*num2;
    }*/
    
    public void Mostrar(){
    
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        //System.out.println("El resultado de la multiplicación es: "+multi);
    }
    
    public static void main(String[] args){

        Calculadora calculo=new Calculadora();
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Ingrese 1er numero: ");
        int a=sc.nextInt();
        System.out.print("Ingrese 2do numero: ");
        int b=sc.nextInt();
        
        
        
        calculo.Pedir_datos(a,b);
        calculo.Sumar();
        calculo.Restar();
        //calculo.Multiplicacion();
        calculo.Mostrar();
        
        
        
        
    }
    
}

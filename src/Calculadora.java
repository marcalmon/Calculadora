/**
 *
 * @author Ingles
 */


public class Calculadora {
    
    int num1;
    int num2;
    int suma=0;
    int resta=0;
    int multi=0;
    
    public void Sumar(int num1, int num2){
    
        suma=num1+num2;
    }
    
    public void Restar(int num1, int num2){
    
        resta=num1-num2;
    }
    
    public void Multiplicacion(int num1, int num2){
    
        multi=num1*num2;
    }
    
    public void Mostrar(){
    
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multi);
    }
    
    public static void main(String[] args){

        int a=5;
        int b=7;
        
        Calculadora calculo=new Calculadora();
        
        calculo.Sumar(a,b);
        calculo.Restar(a,b);
        calculo.Multiplicacion(a,b);
        calculo.Mostrar();
        
    }
    
}

import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        
        
        String nombre, cal;             // variables de tipo String para el nombre y la Calificacion con Letra
        int i;                          // Auxiliar para bucle
        float a;                        // para el promedio
        float calif[] = new float [5];  // array de 5 ya que solo pide 5 calificaciones
        System.out.println("Bienvenido alumno al programa de calculos de promedio \n");
        System.out.println("Introduzca tu nombre: ");
       
        Scanner in = new Scanner(System.in);
        
        nombre = in.nextLine();
        
        for(i = 0; i<5; i++)
        {
            System.out.println("Introduce la calificacion de la materia "+(i+1));
            calif[i] = in.nextFloat();
        }
        
        a = prom(calif);        
        cal = Calf(a);          
        
        MostrarR(nombre,calif,a,cal);//metodo para mostrar los resultados
        
    }
    
    ////metodo//////
    static float prom(float lista[])  
    {
        //variables auxiliares
        float pro;
        int i;
        float sum = 0;
            
        //sumatoria de los elementos en el array
        for(i=0;i<5;i++)
        {
            sum = sum + lista[i];
        }
        
        pro = sum/5;
        return pro;
    }
    
    
    static String Calf(float promedio)
    {
        String cal = null;
        
        
        if (promedio <= 50)
                cal = "F";
        else if (promedio <= 60 && promedio > 51)
                cal = "E";
        else if (promedio <= 70 && promedio > 61)
                cal = "D";
        else if (promedio <= 80 && promedio > 71)
                cal = "C";
        else if (promedio <= 90 && promedio > 81)
                cal = "B";
        else if (promedio <= 100 && promedio > 91)
                cal = "A";
        
        return cal; // segun el resultado cal obtiene un valor y es lo que devuelve el metodo
    }
    
    
    
    static void MostrarR(String nombre,float grades[],float promedio,String Cfinal) 
    {                                                                       
        int i;
        
        System.out.println("\n ****Resultados****\n");
        System.out.println("Nombre: "+nombre);
        System.out.println("------------------------------");
        System.out.println("\nCalificaciones individuales");
        
        for(i=0;i<5;i++)
        {
            System.out.println("\nMateria "+(i+1)+" : "+grades[i]);
        }
        System.out.println("------------------------------");
        System.out.println("\nPromedio: "+promedio);
        System.out.println("------------------------------");
        System.out.println("\nCalificacion: "+Cfinal);
    }
}
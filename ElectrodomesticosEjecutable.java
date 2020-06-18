package evaluacionintermedia2M1;

/*Autor:Felipe Quintupray
Ejecutable Evaluación Intermedia Módulo 1*/

public class ElectrodomesticosEjecutable {
 
	public static void main(String[] args) {
        
        Electrodomesticos listadoElectrodomesticos[]=new Electrodomesticos[10];
 
        listadoElectrodomesticos[0]=new Electrodomesticos(150, 30, "GRIS", 'B');
        
        listadoElectrodomesticos[1]=new Electrodomesticos(200, 25, "AZUL", 'C');
        
        listadoElectrodomesticos[2]=new Electrodomesticos(120, 70, "ROJO",'D');
        
        listadoElectrodomesticos[3]=new Electrodomesticos();
        
        listadoElectrodomesticos[4]=new Lavadora();
        
        listadoElectrodomesticos[5]=new Lavadora(275, 30, "BLANCO", 'B', 30);
        
        listadoElectrodomesticos[6]=new Lavadora(250, 65, "NEGRO", 'C', 40);
        
        listadoElectrodomesticos[7]=new Television(156, 24, "NEGRO", 'A', 80, false);
        
        listadoElectrodomesticos[8]=new Television(257, 32,"GRIS", 'B', 36, true);
        
        listadoElectrodomesticos[9]=new Television();
 
        float sumaElectrodomesticos=0;
        float sumaTelevisores=0;
        float sumaLavadoras=0;
   
  
        for(int i=0;i<listadoElectrodomesticos.length;i++){
    
            if(listadoElectrodomesticos[i] instanceof Electrodomesticos){
                sumaElectrodomesticos+=listadoElectrodomesticos[i].precioFinal();
            }
            if(listadoElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listadoElectrodomesticos[i].precioFinal();
            }
            if(listadoElectrodomesticos[i] instanceof Television){
                sumaTelevisores+=listadoElectrodomesticos[i].precioFinal();
            }
        }
   
        System.out.println("El total de la suma de los precios de los electrodomésticos es: "+sumaElectrodomesticos+" euros.");
        
        System.out.println("El total de la suma de los precios de las lavadoras es: "+sumaLavadoras+" euros.");
        
        System.out.println("El total de la suma de los precios de los televisores es: "+sumaTelevisores+" euros.");
        
   
    }
		
	

}

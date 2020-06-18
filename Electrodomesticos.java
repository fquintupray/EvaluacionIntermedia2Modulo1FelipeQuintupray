package evaluacionintermedia2M1;

/*Autor:Felipe Quintupray
Evaluación Intermedia Módulo 1*/

public class Electrodomesticos {
	private float precioBase;
	private String color;
	private char consumoEnergetico;
	private float peso;
	public static final float PRECIO_BASE_DEFECTO=100;
	public static final String COLOR_DEFECTO = "BLANCO";
	public static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
	public static final float PESO_DEFECTO = 5;

	public Electrodomesticos() {
		precioBase = PRECIO_BASE_DEFECTO;
		color = COLOR_DEFECTO;
		consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		peso = PESO_DEFECTO;
	}
 
	public Electrodomesticos(float precioBase, float peso) {
		this();
		this.precioBase = precioBase;
		this.peso = peso;
	}
 
	public Electrodomesticos(float precioBase, float peso, String color, char consumoEnergetico) {
		this(precioBase, peso);
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
	}
 
	public float getPrecioBase() {
		return precioBase;
	}
 
	public String getColor() {
		return color;
	}
 
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
 
	public float getPeso() {
		return peso;
	}
 
   public void comprobarConsumoEnergetico(char consumoEnergetico){
        
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_DEFECTO;
        }
          
    }
 
	public void comprobarColor(String color) {

		String colores[] = new String[5];
		colores[0] = "BLANCO";
		colores[1] = "AZUL";
		colores[2] = "NEGRO";
		colores[3]= "ROJO";
		colores[4]="GRIS";
		boolean comprobado= false; 
		for (int i = 0; i < colores.length && !comprobado; i++) {
			if (colores[i].contentEquals(color)) {
				comprobado = true;
			}
		}			
		if (comprobado) {
			this.color = color;
		} else {
			this.color = COLOR_DEFECTO;
		}
	}
 
    public float precioFinal(){
    	float precioBaseElectrodomestico = 0;
        switch(consumoEnergetico){
            case 'A':
            	precioBaseElectrodomestico+=100;
                break;
            case 'B':
            	precioBaseElectrodomestico+=80;
                break;
            case 'C':
            	precioBaseElectrodomestico+=60;
                break;
            case 'D':
            	precioBaseElectrodomestico+=50;
                break;
            case 'E':
            	precioBaseElectrodomestico+=30;
                break;
            case 'F':
            	precioBaseElectrodomestico+=10;
                break;
        }
       
        if(peso>=0 && peso<=19){
            precioBaseElectrodomestico+=10;
        }else if(peso>=20 && peso<49){
        	precioBaseElectrodomestico+=50;
        }else if(peso>=50 && peso<=79){
        	precioBaseElectrodomestico+=80;
        }else if(peso>=80){
        	precioBaseElectrodomestico+=100;
        }
        precioBaseElectrodomestico = precioBaseElectrodomestico + precioBase;
       
        return precioBaseElectrodomestico ;
    }
    
    
}


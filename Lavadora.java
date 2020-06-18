package evaluacionintermedia2M1;

/*Autor:Felipe Quintupray
Evaluación Intermedia Módulo 1*/

import evaluacionintermedia2M1.Electrodomesticos;

public class Lavadora extends Electrodomesticos {
	private int carga;
	public static final int CARGA_DEFECTO = 15;
	
	public Lavadora() {
		super();
		carga = CARGA_DEFECTO;
	}
 
	public Lavadora(float precioBase, int peso) {
		super(precioBase, peso);
		carga = CARGA_DEFECTO;
	}
 
	public Lavadora(float precioBase, int peso, String color, char consumoEnergetico,
			int carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}
 
	public int getCarga() {
		return carga;
	}
 
	public float precioFinal() {
		float precioLavadora = 0;
		 float precioBaseElectrodomestico = super.precioFinal();
		        if (carga>30){
		            precioLavadora+=50;
		        }
		return  precioBaseElectrodomestico + precioLavadora;
	}
	
}

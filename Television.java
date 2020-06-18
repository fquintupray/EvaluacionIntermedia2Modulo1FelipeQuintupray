package evaluacionintermedia2M1;

/*Autor:Felipe Quintupray
Evaluación Intermedia Módulo 1*/

import evaluacionintermedia2M1.Electrodomesticos;

public class Television extends Electrodomesticos{
	private float resolucion;
	private boolean sintTDT;
	public static final float RESOLUCION_DEFECTO = 20;
 
	public Television() {
		super();
		resolucion = RESOLUCION_DEFECTO;
		sintTDT = false;
	}

	public Television(float precioBase, int peso) {
		super(precioBase, peso);
	}


	public Television(float precioBase, int peso, String color, char consumoEnergetico,
			float resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintTDT = sintonizadorTDT;
	}


	public float getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintTDT;
	}
	
    public float precioFinal(){
        float precioTelevisor = 0;
        float precioBaseElectrodomestico=super.precioFinal();
        if (resolucion>40){
            precioTelevisor = (float) (precioBaseElectrodomestico*0.3);
        }
        if (sintTDT){
            precioTelevisor+=50;
        }
        return precioBaseElectrodomestico + precioTelevisor;
    }
}    

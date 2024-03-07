package uniandes.dpoo.aerolinea.modelo;

import java.util.ArrayList;
import java.util.Collection;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
	private Ruta ruta;
	private String fecha;
	private Avion avion;
	private ArrayList tiquetes;
	
	public Vuelo(Ruta ruta, String fecha) {
		this.ruta=ruta;
		this.fecha=fecha;
		
	}
	public Vuelo(String fecha2, String codigoRuta, Avion avion, String fecha) {
		this.ruta = ruta; 
        this.fecha = fecha;
        this.avion = avion;
        this.tiquetes = new ArrayList<>();	}
	public Ruta getRuta() {
		return this.ruta;
	}
    public String getFecha() {
    	return this.fecha;
    }
	public Object getCodigoRuta() {
		return this.ruta.getCodigoRuta();
	}
	public Collection<? extends Tiquete> getTiquetes() {
		return this.getTiquetes();
	}
	public int venderTiquetes(Cliente cliente, int cantidad) {
		return 0;
	}
	public Object setRealizado(boolean b) {
		return this.setRealizado(b);
		
		
	}
}


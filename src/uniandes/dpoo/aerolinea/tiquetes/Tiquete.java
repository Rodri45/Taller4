package uniandes.dpoo.aerolinea.tiquetes;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
public class Tiquete {
    private String codigoTiquete;
    private Vuelo vuelo;
    private Cliente cliente;
    private int tarifa;
    private boolean usado; 

    public Tiquete(String codigoTiquete, Vuelo vuelo, Cliente cliente, int tarifa) {
        this.codigoTiquete = codigoTiquete;
        this.vuelo = vuelo;
        this.cliente = cliente;
        this.tarifa = tarifa;
        this.usado = false; 
    }

    public String getCodigo() {
        return codigoTiquete;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void marcarComoUsado() {
        this.usado = true;
    }

    public boolean esUsado() {
        return usado;
    }
}
package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
    public static final String NATURAL = "natural";
	private String tipoCliente;

    public ClienteNatural(String nombre) {
        super(); 
        this.tipoCliente = NATURAL;
    }

    public String getTipoCliente() {
        return this.tipoCliente;
    }
}

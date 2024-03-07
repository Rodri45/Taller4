package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente {
    public static final String NATURAL = "natural";
	private String tipoCliente;

    public ClienteNatural(String nombre) {
        super(); // Assuming the superclass Cliente has a constructor that takes a name
        this.tipoCliente = NATURAL;
    }

    @Override
    public String getTipoCliente() {
        return this.tipoCliente;
    }
}

package uniandes.dpoo.aerolinea.modelo.cliente;

import org.json.JSONObject;

/**
 * Esta clase se usa para representar a los clientes de la aerolínea que son empresas
 */
public class ClienteCorporativo extends Cliente
{
    private String nombreEmpresa;
    private int tamanoEmpresa;
    public static final String CORPORATIVO = "corporativo";

    public ClienteCorporativo(String nombreEmpresa, int tamanoEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.tamanoEmpresa = tamanoEmpresa;
    }

   
    public static ClienteCorporativo cargarDesdeJSON(JSONObject cliente) {
        String nombreEmpresa = cliente.getString("nombreEmpresa");
        int tam = cliente.getInt("tamanoEmpresa");
        return new ClienteCorporativo(nombreEmpresa, tam);
    }

    public JSONObject salvarEnJSON() {
        JSONObject jobject = new JSONObject();
        jobject.put("nombreEmpresa", this.nombreEmpresa);
        jobject.put("tamanoEmpresa", this.tamanoEmpresa);
        jobject.put("tipo", CORPORATIVO);
        return jobject;
    }
}
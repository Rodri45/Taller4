package uniandes.dpoo.aerolinea.tiquetes;

import java.util.HashSet;
import java.util.Set;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

/**
 * Esta clase representa al módulo del sistema que es capaz de generar nuevos tiquetes, asignándole a cada uno un código único.
 */
public class GeneradorTiquetes
{
    /**
     * Un conjunto con los códigos que ya han sido usados anteriormente para otros tiquetes.
     * 
     * Este conjunto se utiliza para no correr el riesgo de repetir un código.
     */
    private static Set<String> codigos = new HashSet<String>( );
    public static Tiquete generarTiquete1(Vuelo vuelo, Cliente cliente, int tarifa) {
        int numero = (int) (Math.random() * 10e7);
        String codigo = String.format("%07d", numero);

        while(codigos.contains(codigo)) {
            numero = (int) (Math.random() * 10e7);
            codigo = String.format("%07d", numero);
        }

        codigos.add(codigo);  // Registra el código inmediatamente después de generarlo para evitar duplicaciones
        return new Tiquete(codigo, vuelo, cliente, tarifa);
    }

    /**
     * Registra que un cierto tiquete ya fue vendido, para que el generador de tiquetes
     * no vaya a generar otro tiquete con el mismo código.
     */
    public static void registrarTiquete1(Tiquete unTiquete) {
        codigos.add(unTiquete.getCodigo());
    }

    /**
     * Revisa si ya existe un tiquete con el código dado.
     */
    public static boolean validarTiquete1(String codigoTiquete) {
        return codigos.contains(codigoTiquete);
    }

    
    
    
    
    
    
    
    
    
    
    
    public static Tiquete generarTiquete( Vuelo vuelo, Cliente cliente, int tarifa )
    {
        int numero = ( int ) ( Math.random( ) * 10e7 );
        String codigo = "" + numero;
        while( codigos.contains( codigo ) )
        {
            numero = ( int ) ( Math.random( ) * 10e7 );
            codigo = "" + numero;
        }

        while( codigo.length( ) < 7 )
            codigo = "0" + codigo;

        return new Tiquete( codigo, vuelo, cliente, tarifa );
    }

  
    public static void registrarTiquete( Tiquete unTiquete )
    {
    	if (unTiquete != null && unTiquete.getCodigo() != null) {
            codigos.add(unTiquete.getCodigo());
            }
    }

  
    public static boolean validarTiquete( String codigoTiquete )
    {
    	 return codigos.contains(codigoTiquete);
    }
}

package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
    private String codigoRuta; 

    public Ruta(String codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    public String getCodigoRuta() {
        return this.codigoRuta;
    }


    public static int getMinutos(String horaCompleta) {
        int minutos = Integer.parseInt(horaCompleta) % 100;
        return minutos;
    }

    public static int getHoras(String horaCompleta) {
        int horas = Integer.parseInt(horaCompleta) / 100;
        return horas;
    }

}


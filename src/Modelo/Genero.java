
package Modelo;


public enum Genero {
    MASCULINO,
    FEMENINO,
    LGTBI,
    OTRO;
/**
 * Se crean los géneros para los clientes y empleados
 */
    public static Genero getGenero(int i) {
        switch (i) {
            case 0:
                return MASCULINO;
            case 1:
                return FEMENINO;
            case 2:
                return LGTBI;
            case 3:
                return OTRO;
            default:
                return null;
        }
    }

    public static int getIndex(String genero) {
        if (genero.equalsIgnoreCase(MASCULINO.toString())) {
            return 0;
        } else if (genero.equalsIgnoreCase(FEMENINO.toString())) {
            return 1;
        } else if (genero.equalsIgnoreCase(LGTBI.toString())) {
            return 2;
        } else if (genero.equalsIgnoreCase(OTRO.toString())) {
            return 3;
        } else {
            return 3;
        }

    }
}

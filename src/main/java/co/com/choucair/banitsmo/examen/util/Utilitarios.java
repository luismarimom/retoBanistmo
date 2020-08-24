package co.com.choucair.banitsmo.examen.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utilitarios {

    private Utilitarios(){}

    private static final String AVISO = "\n----------------------------------------------------------------\n%s\n----------------------------------------------------------------";
    private static final Logger LOGGER = LoggerFactory.getLogger(Utilitarios.class);

    public static void esperaExplicita(long duracion) {
        try {
            String s = formatiarAviso("se pausa el programa por " + (duracion / 1000L) + "s");
            LOGGER.info(s);
            Thread.sleep(duracion);
        } catch (InterruptedException e) {
            LOGGER.info(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    public static String formatiarAviso(String mensaje) {
        return String.format(AVISO, mensaje);
    }
}

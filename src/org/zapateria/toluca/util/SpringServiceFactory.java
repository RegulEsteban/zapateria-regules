package org.zapateria.toluca.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Clase encargada de manejar el contexto de Spring.
 */
public class SpringServiceFactory implements ApplicationContextAware {

    /**
     * Contexto de Spring que contiene a la aplicación.
     */
    private static ApplicationContext applicationContext;

    /**
       * Crea un objeto <code>SpringServiceFactory</code>.
       */
    public SpringServiceFactory() {
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param serviceId Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    public static boolean containsBean(final String serviceId) {
        return applicationContext.containsBean(serviceId);
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param serviceId Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    public static Object createBean(final String serviceId) {
        return applicationContext.getBean(serviceId);
    }

    /**
     * Documentar el objetivo del metodo!
     *
     * @param serviceType Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    /*@SuppressWarnings("rawtypes")
    public static Object createBean(final Class serviceType) {
        return applicationContext.getBean(serviceType.getName());
    }*/

    /**
     * Documentar el objetivo del metodo!
     *
     * @param code Documentar el parametro!
     * @param args Documentar el parametro!
     * @param locale Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    /*public static String getMessage(final String code, final Object[] args, final Locale locale) {
        return applicationContext.getMessage(code, args, locale);
    }*/

    /**
     * Documentar el objetivo del metodo!
     *
     * @param code Documentar el parametro!
     * @param args Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    /*public static String getMessage(final String code, final Object[] args) {
        return applicationContext.getMessage(code, args, Locale.getDefault());
    }*/

    /**
     * Documentar el objetivo del metodo!
     *
     * @param code Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    /*public static String getMessage(final String code) {
        return applicationContext.getMessage(code, null, Locale.getDefault());
    }*/

    /**
     * Documentar el objetivo del metodo!
     *
     * @param filePathName Documentar el parametro!
     *
     * @return Documentar retorno!
     */
    /*public static InputStream getResourceAsStream(final String filePathName) {
        try {
            return applicationContext.getResource(filePathName).getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/

    /**
     * Documentar el objetivo del metodo!
     *
     * @param theApplicationContext Documentar el parametro!
     */
    public final void setApplicationContext(final ApplicationContext theApplicationContext) {
        applicationContext = theApplicationContext;

    }

    /*public static void close() {
        if (applicationContext != null)
            ((ConfigurableApplicationContext) applicationContext).close();
    }*/

}

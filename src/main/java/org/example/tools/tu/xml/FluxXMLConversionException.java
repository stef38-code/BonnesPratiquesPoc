package org.example.tools.tu.xml;

/**
 * Cette classe représente une exception personnalisée qui est levée lorsqu'une erreur se produit
 * lors de la conversion d'un flux XML en une instance d'une classe spécifique.
 */
public class FluxXMLConversionException extends RuntimeException {
    /**
     * Construit une nouvelle FluxXMLConversionException avec le message d'erreur spécifié.
     *
     * @param message Le message d'erreur détaillé pour cette exception.
     */
    public FluxXMLConversionException(String message) {
        super(message);
    }

    /**
     * Construit une nouvelle FluxXMLConversionException avec le message d'erreur spécifié et la cause.
     *
     * @param message Le message d'erreur détaillé pour cette exception.
     * @param cause La cause originale de l'exception.
     */
    public FluxXMLConversionException(String message, Throwable cause) {
        super(message, cause);
    }
}

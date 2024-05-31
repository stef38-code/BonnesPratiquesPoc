package org.example.tools.tu.xml;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Cette classe fournit une méthode pour convertir un flux XML en une instance d'une classe
 * spécifique.
 */
public class FluxXMLVersClasse {
private FluxXMLVersClasse() {
    throw new UnsupportedOperationException("FluxXMLVersClasse is a utility class and cannot be instantiated");
}
    /**
     * Lit un fichier à partir d'un chemin spécifié et retourne son contenu sous forme d'InputStream.
     *
     * @param cheminFichier Le chemin du fichier à lire.
     * @return Le contenu du fichier sous forme d'InputStream.
     * @throws IOException Si une erreur se produit lors de la lecture du fichier.
     */
    private static InputStream lireFichier(String cheminFichier) throws IOException {
        return Files.newInputStream(Paths.get(cheminFichier));
    }
    /**
     * Convertit un flux XML en une instance d'une classe spécifique.
     *
     * @param flux Le flux XML à convertir.
     * @param classe La classe dans laquelle le flux XML doit être converti.
     * @param <T> Le type de la classe.
     * @return Une instance de la classe spécifiée, remplie avec les données du flux XML.
     * @throws JAXBException Si une erreur se produit lors de la conversion, notamment si le flux
     *     XML ne peut pas être converti en l'instance de la classe spécifiée.
     * @throws FluxXMLConversionException Si une erreur se produit lors de la conversion, notamment si le flux
     *     XML ne peut pas être converti en l'instance de la classe spécifiée.
     */
    private static <T> T unmarshalFlux(InputStream flux, Class<T> classe) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(classe);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        try {
            return classe.cast(jaxbUnmarshaller.unmarshal(flux));
        } catch (ClassCastException e) {
            throw new FluxXMLConversionException(
                    "Le flux XML ne peut pas être converti en " + classe.getName(), e);
        }
    }
    /**
     * Convertit un flux XML en une instance d'une classe spécifique.
     *
     * @param cheminFichier Le chemin du fichier XML à convertir.
     * @param classe La classe dans laquelle le flux XML doit être converti.
     * @param <T> Le type de la classe.
     * @return Une instance de la classe spécifiée, remplie avec les données du flux XML.
     * @throws RuntimeException Si une erreur se produit lors de la conversion, notamment si le flux
     *     XML ne peut pas être converti en l'instance de la classe spécifiée.
     */
    public static <T> T convertirFluxXMLenClasse(String cheminFichier, Class<T> classe) {
        try (InputStream flux = lireFichier(cheminFichier)) {
            return unmarshalFlux(flux, classe);
        } catch (JAXBException | IOException e) {
            throw new FluxXMLConversionException("Erreur lors de la conversion du flux XML en classe", e);
        }
    }
}


package org.example.tools.tu.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Objects;

import static org.slf4j.LoggerFactory.getLogger;

public class JsonUtil {
    private JsonUtil() {
        throw new UnsupportedOperationException("JsonUtil is a utility class and cannot be instantiated");
    }
    private static final Logger log = getLogger(JsonUtil.class);


    public static <T> List<T> convertJsonFileToList(String jsonFilePath) throws IOException {

        File file = getFileRessource(jsonFilePath);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        objectMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        return objectMapper.readValue(file, new TypeReference<List<T>>(){});
    }
    public static <T> T convertJsonFileToClass(String jsonFilePath, Class<T> clazz) throws IOException {
        File file = getFileRessource(jsonFilePath);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
        objectMapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
        return objectMapper.readValue(file, clazz);
    }
    /**
     * Gets the file ressource.
     *
     * @param nomFichierObject the nom fichier object
     * @return the file ressource
     */
    private static File getFileRessource(String nomFichierObject) {
        log.info("fichier de ressources:{}", nomFichierObject);
        URL resource = Objects.requireNonNull(JsonUtil.class.getClassLoader().getResource(nomFichierObject));
        return new File(resource.getFile());
    }
}

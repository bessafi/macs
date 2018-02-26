package com.bombardier.macs.config;
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;

import com.bombardier.macs.json.model.Part;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


TODO 
@Configuration
@Profile({"simple-cache","macs-cache"})
public class JsonDataConfig {

    @Autowired
    private ObjectMapper objectMapper;

    @Value("classpath:/ebom.json")
    private Resource partsJsonResource;

    @Bean
    public List<Part> payloadParts() throws IOException {

        try(InputStream inputStream = partsJsonResource.getInputStream()) {

            Part[] payloadParts = objectMapper.readValue(inputStream, Part[].class);
          
            return Collections.unmodifiableList(Arrays.asList(payloadParts));
  
        }
    }
}
*/
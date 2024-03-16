package pe.interbank.moneybox.padlock.infrastructure.config;


import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

@Configuration
public class SpringMongoConfig {
    @Autowired
    private MappingMongoConverter mappingMongoConverter;

    @PostConstruct
    public void setUpMongoEscapeCharacterConversion() {
        this.mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));
    }
}

package io.javabrains.movieinfoservice.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Suleyman Yildirim
 */

@Getter
@Setter
@Configuration
@ConfigurationProperties("db")
public class DBSettings {

    private String connection;
    private String host;
    private int port;
}

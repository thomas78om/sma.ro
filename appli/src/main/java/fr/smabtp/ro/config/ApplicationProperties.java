package fr.smabtp.ro.config;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Ajeter.
 * <p>
 * Properties are configured in the {@code application.yml} file.

 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}

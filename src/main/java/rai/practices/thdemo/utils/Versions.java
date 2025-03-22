package rai.practices.thdemo.utils;

import java.util.logging.Logger;

import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.springframework.core.SpringVersion;

public final class Versions {
  private static final Logger logger = Logger.getLogger("DemoApplication");
  private static final PluginDescriptor pluginDescriptor = new PluginDescriptor();

  // Private constructor to prevent instantiation
  private Versions() {
  }

  public static void showVersions() {
    logger.info("Spring Framework version: " + SpringVersion.getVersion());
    // TODO: não retorna a versão do Maven: pesquisar motivo e corrigir.
    logger.info("Maven version: " + pluginDescriptor.getVersion());
    logger.info("Thymeleaf version: " + org.thymeleaf.Thymeleaf.getVersion());
    try {
      // TODO: só execute em ambiente Windows. Ver como fazer em Linux.
      ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "mvn -v");
      Process process = processBuilder.start();
      java.io.BufferedReader reader = new java.io.BufferedReader(
          new java.io.InputStreamReader(process.getInputStream()));
      String line;
      line = reader.readLine();
      logger.info(line);
      process.waitFor();
    } catch (Exception e) {
      logger.severe("Error executing command: " + e.getMessage());
    }
  }
}

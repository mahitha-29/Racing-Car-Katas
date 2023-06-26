package tddmicroexercises.telemetrysystem;

public interface ConnectionInterface {

    void disconnect();

    void connect(String telemetryServerConnectionString);
}

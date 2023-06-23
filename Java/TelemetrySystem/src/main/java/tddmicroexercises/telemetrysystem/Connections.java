package tddmicroexercises.telemetrysystem;

public interface Connections {

    void disconnect();

    void connect(String telemetryServerConnectionString);
}

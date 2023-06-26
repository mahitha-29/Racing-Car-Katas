
package tddmicroexercises.telemetrysystem;

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

public class TelemetryClientTest {
    @Test
    public void testTelemetryClientConnect() {

        boolean onlineStatus = false;
        ConnectionInterface connection = new Connection(onlineStatus);
        TransferInterface transfer = new Transfer("");
        TelemetryClient telemetryClient = new TelemetryClient(connection, transfer);


        telemetryClient.connect("connect");


        Assertions.assertTrue(telemetryClient.getOnlineStatus());
    }

    @Test
    public void testTelemetryClientDisconnect() {
        // Arrange
        boolean onlineStatus = true;
        ConnectionInterface connection = new Connection(onlineStatus);
        TransferInterface transfer = new Transfer("");
        TelemetryClient telemetryClient = new TelemetryClient(connection, transfer);


        telemetryClient.disconnect();


        Assertions.assertFalse(telemetryClient.getOnlineStatus());
    }

    @Test
    public void testTelemetryDiagnosticControlsCheckTransmission() throws Exception {

        boolean onlineStatus = true;
        String diagnosticMessageResult = "";
        ConnectionInterface connection = new Connection(onlineStatus);
        TransferInterface transfer = new Transfer(diagnosticMessageResult);
        TelemetryClient telemetryClient = new TelemetryClient(connection, transfer);
        TelemetryDiagnosticControls telemetryDiagnosticControls = new TelemetryDiagnosticControls(telemetryClient);


        telemetryDiagnosticControls.checkTransmission();


        Assertions.assertFalse(telemetryClient.getOnlineStatus());
    }
}


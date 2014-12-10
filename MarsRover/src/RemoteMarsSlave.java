import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.bluetooth.RemoteDevice;

import lejos.nxt.comm.BTConnection;
import lejos.nxt.comm.Bluetooth;


public class RemoteMarsSlave {
	private BTConnection connection;
	private DataInputStream inputStream;
	private DataOutputStream outputStream;
	
	private static final int READ_ULTRASONIC = 1;
	private static final int READ_COLOR = 2;
	private static final int PROBE_LAKE = 3;
	private static final int LAMP_ON = 4;
	private static final int LAMP_OFF = 5;
	
	public void connect(String slaveName) {
		RemoteDevice remoteDevice = null;
		while (remoteDevice == null)
			remoteDevice = Bluetooth.getKnownDevice(slaveName);
		
		while (this.connection == null)
			this.connection = Bluetooth.connect(remoteDevice);
		
		this.inputStream = this.connection.openDataInputStream();
		this.outputStream = this.connection.openDataOutputStream();	
	}
	
	public void lampOn() {
		try {
			writeCommand(LAMP_ON);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void lampOff() {
		try {
			writeCommand(LAMP_OFF);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int readColor() throws IOException {
		writeCommand(READ_COLOR);
		return this.inputStream.readInt();
	}
	
	public float probeLake() throws IOException {
		writeCommand(PROBE_LAKE);
		return this.inputStream.readFloat();
	}
	
	private void writeCommand(int command) throws IOException {
		this.outputStream.writeInt(command);
		this.outputStream.flush();
	}
}

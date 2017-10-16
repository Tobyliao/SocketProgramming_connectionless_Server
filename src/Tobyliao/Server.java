package Tobyliao;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
	public static void main(String args[]) {
		int ServerPort = 1111;
		System.out.println("Server Port:"+ServerPort);
		
		try {
			DatagramSocket socket = new DatagramSocket(ServerPort);
			byte[] msgBuffer = new byte[1024];
			DatagramPacket packet = new DatagramPacket(msgBuffer,msgBuffer.length);
			 while (true)
             {
                     socket.receive(packet);
                     String message = new String(msgBuffer, 0, packet.getLength());
                     System.out.println("UDPServer: Message received = " + message);
                     packet.setLength(msgBuffer.length);
             }
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            System.out.println("Error in getting the Data from UDP Client");
		}
		
	}

}

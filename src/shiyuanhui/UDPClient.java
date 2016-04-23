package shiyuanhui;



import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) {
		try {
			//首先创建一个DatagramSocket对象
			DatagramSocket socket = new DatagramSocket(4567);
			//创建一个InetAddree
			InetAddress serverAddress = InetAddress.getByName("183.30.189.14");
			String str = "hello";
			byte data [] = str.getBytes();
			//创建一个DatagramPacket对象，并指定要讲这个数据包发送到网络当中的哪个地址，以及端口号
			DatagramPacket packet = new DatagramPacket(data,data.length,serverAddress,4567);
			//调用socket对象的send方法，发送数据
			socket.send(packet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

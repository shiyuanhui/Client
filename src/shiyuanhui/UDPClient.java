package shiyuanhui;



import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
	public static void main(String[] args) {
		try {
			//���ȴ���һ��DatagramSocket����
			DatagramSocket socket = new DatagramSocket(4567);
			//����һ��InetAddree
			InetAddress serverAddress = InetAddress.getByName("183.30.189.14");
			String str = "hello";
			byte data [] = str.getBytes();
			//����һ��DatagramPacket���󣬲�ָ��Ҫ��������ݰ����͵����統�е��ĸ���ַ���Լ��˿ں�
			DatagramPacket packet = new DatagramPacket(data,data.length,serverAddress,4567);
			//����socket�����send��������������
			socket.send(packet);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

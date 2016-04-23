package shiyuanhui;



import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) {
		try {
			//����һ��Socket����ָ���������˵�IP��ַ�Ͷ˿ں�
			Socket socket = new Socket("192.168.1.104",4567);
			//ʹ��InputStream��ȡӲ���ϵ��ļ�
			InputStream inputStream = new FileInputStream("f://file/words.txt");
			//��Socket���еõ�OutputStream
			OutputStream outputStream = socket.getOutputStream();
			byte buffer [] = new byte[4*1024];
			int temp = 0 ;
			//��InputStream���е�����ȡ������д�뵽OutputStream����
			while((temp = inputStream.read(buffer)) != -1){
				outputStream.write(buffer, 0, temp);
			}
			outputStream.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}}
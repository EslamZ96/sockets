import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Socket socket = new Socket("localhost", 9090);

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        System.out.println("enter width: ");
        double width = sc.nextDouble();
        dos.writeDouble(width);

        System.out.println("Enter Height: ");
        double height = sc.nextDouble();
        dos.writeDouble(height);

        double area = dis.readDouble();
        System.out.println("Area is: " + area);
    }
}

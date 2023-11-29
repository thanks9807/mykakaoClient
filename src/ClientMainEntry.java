import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainEntry {

    public static void main(String[] args) {
        String ip = "127.0.0.1";
        int port = 9807;
        Scanner scanner = new Scanner(System.in);
        //서버에 연결한다.
        //1. 서버 연결에 성공한다. -> userID를 받는다.
        //2. 서버 연결에 실패한다. -> 연결 실패 메시지 와 다시 시도를 위해 아무버튼 입력
        while(true){
            try {
                Socket socket = new Socket(ip,port);

            } catch (IOException e) {
                System.out.println("연결이 실패했습니다. 아무버튼을 눌러 재시도.");
                scanner.next();
                //throw new RuntimeException(e);
            }
        }


        //로그인을 한다.
        //1. 로그인에 성공한다. 2. 로그인에 실패한다. 3.회원가입 신청을한다.
        //1. 로그인에 성공한다. -> 자신의 친구 리스트와 채팅방 리스트를 받는다.
        //2. 로그인에 실패한다. -> 계속 로그인을 시도한다.
        //3. 회원가입 신청한다. -> 회원가입 기능을 실행한 후 다시 로그인을 시도한다.


        //Login login = new Login();
        //login.tryLogin();

    }
}

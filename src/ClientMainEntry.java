import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainEntry {
    static Socket socket;
    public static void main(String[] args) {
        String ip = "127.0.0.1";
        int port = 9807;
        Scanner scanner = new Scanner(System.in);

        //서버에 연결한다.
        //1. 서버 연결에 성공한다. -> userID를 받는다.
        //2. 서버 연결에 실패한다. -> 연결 실패 메시지 와 다시 시도를 위해 아무버튼 입력
        while(true){
            try {
                socket = new Socket(ip,port);
                break;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                System.out.println("연결이 실패했습니다. 아무버튼을 눌러 재시도.");
                System.out.println("또는 exit 입력을 통해 나가기.");
                scanner.next();
                
                //throw new RuntimeException(e);
            }
        }

        //로그인을 한다.
        //1. 로그인에 성공한다. 2. 로그인에 실패한다. 3.회원가입 신청을한다.
        //1. 로그인에 성공한다. -> 자신의 친구 리스트와 채팅방 리스트를 받는다.
        //2. 로그인에 실패한다. -> 계속 로그인을 시도한다.
        //3. 회원가입 신청한다. -> 회원가입 기능을 실행한 후 다시 로그인을 시도한다.
        System.out.print("이메일 또는 전화번호 : ");
        String id = scanner.nextLine();
        Login login = new Login();
        SignIn signIn = new SignIn();

        while(true){
            //id = scanner.nextLine();

            if(!login.inputID(id)){
                System.out.println("가입 정보가 없습니다.");
                System.out.println("1입력: 나가기");
                System.out.println("2입력: 회원가입");
                id = scanner.nextLine();
                if(id.equals("1")){}
                else if(id.equals("2")){
                    System.out.println("회원가입을 위해 이메일 또는 전화번호를 입력해주세요.");
                    id = scanner.nextLine();
                    System.out.println("회원가입을 위해 비밀번호를 입력하세요 : ");
                    String pw = scanner.nextLine();
                    signIn.input(id,pw);
                }
            }
            else break;
            id = scanner.nextLine();
        }
        System.out.print("비밀번호를 입력하세요 : ");
        String password = scanner.nextLine();

        while(true){
            //id = scanner.nextLine();
            if(!login.inputPW(password)){
                System.out.println("패스워드가 틀렸습니다.");
                System.out.println("1입력: 나가기");
                System.out.println("2입력: 비밀번호 찾기");
                password = scanner.nextLine();
                if(password.equals("1")){}
                else if(password.equals("2")){}
            }
            else break;
            password = scanner.nextLine();
        }


        // 사용자 입력을 받는다.
        //while(true){}




        //Login login = new Login();
        //login.tryLogin();

    }
}

import java.io.*;

public class Login {
    public boolean inputID(String id) {
        OutputStreamWriter outputStreamWriter;
        BufferedWriter bufferedWriter;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        String msg = "LOGIN@" +id+"\n";
        String res = "";
        try {
            //아이디가 담긴 메시지를 보낸다.
            outputStreamWriter = new OutputStreamWriter(ClientMainEntry.socket.getOutputStream());
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(msg);
            bufferedWriter.flush();

            //아이디가 유효한지 서버의 응답을 기다린다.
            inputStreamReader = new InputStreamReader(ClientMainEntry.socket.getInputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            res = bufferedReader.readLine();
            System.out.println("LOgin 23 : "+res);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        if(res.equals("LOGIN SUCCESS")) return true;
        else return false;
    }

    public boolean inputPW(String passward){
        OutputStreamWriter outputStreamWriter;
        BufferedWriter bufferedWriter;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        String msg = "PASSWORD@" +passward+"\n";
        String res = "";
        try {
            //아이디가 담긴 메시지를 보낸다.
            outputStreamWriter = new OutputStreamWriter(ClientMainEntry.socket.getOutputStream());
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(msg);
            bufferedWriter.flush();

            //아이디가 유효한지 서버의 응답을 기다린다.
            inputStreamReader = new InputStreamReader(ClientMainEntry.socket.getInputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            res = bufferedReader.readLine();
            System.out.println("LOgin.inputPW 52 : "+res);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }


        if(res.equals("PASSWORD SUCCESS")){
            return true;
        }
        else return false;
    }
        //사용자에게 전화번호 또는 이메일을 입력받는다.
        //로그인 서버에 이용자가 맞는지 확인 받는다.
        //사용자에게 비밀번호를 입력 받는다.
        //비밀 번호를 다시한 번 입력 받는다.
        //

}

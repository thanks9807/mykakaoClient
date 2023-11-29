import java.io.*;

public class SignIn {

    public boolean input(String id,String pw) {
        OutputStreamWriter outputStreamWriter;
        BufferedWriter bufferedWriter;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        String msg = "SIGNIN@ID:"+id+"@";
        msg += "PASSWORD:"+pw;
        String res = "";
        try {
            //회원가입 정보가 담긴 메시지를 보낸다.
            outputStreamWriter = new OutputStreamWriter(ClientMainEntry.socket.getOutputStream());
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(msg);
            bufferedWriter.flush();

            //회원가입이 됬는지 서버의 응답을 기다린다.
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


}

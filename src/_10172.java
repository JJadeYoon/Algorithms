import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 16.
 * 문제 : 개
 * 코멘트 :
 */
public class _10172 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line1 = "|\\_/|";
        String line2 = "|q p|   /}";
        String line3 = "( 0 )\"\"\"\\";
        String line4 = "|\"^\"`    |";
        String line5 = "||_/=\\\\__|";
        bw.write(line1+"\n");
        bw.write(line2+"\n");
        bw.write(line3+"\n");
        bw.write(line4+"\n");
        bw.write(line5+"\n");
        bw.flush();
        bw.close();
    }
}

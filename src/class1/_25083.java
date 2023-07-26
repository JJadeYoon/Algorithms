package class1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author : JJadeYoon
 * @date : 2023. 7. 15.
 * 문제 : 새싹
 * 코멘트 : BufferedWriter 정리하기
 */
public class _25083 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line1 = "         ,r\'\"7";
        String line2 = "r`-_   ,'  ,/";
        String line3 = " \\. \". L_r'";
        String line4 = "   `~\\/";
        String line5 = "      |";
        String line6 = "      |";
        bw.write(line1+"\n");
        bw.write(line2+"\n");
        bw.write(line3+"\n");
        bw.write(line4+"\n");
        bw.write(line5+"\n");
        bw.write(line6+"\n");
        bw.flush();
        bw.close();
    }
}

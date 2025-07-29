package demo4;
import java.util.Random;
import java.util.Scanner;
public class day2 {
    public static void main(String[] args) {
        Random rand=new Random();
        char[] ch=new char[62];
        char[] c=new char[5];
        for(int i=0;i<10;i++){
            ch[i]=(char)('0'+i);
        }
        for(int i=10,j=0;i<36;i++,j++){
            ch[i]=(char)('a'+j);
        }
        for(int i=36,j=0;i<ch.length;i++,j++){
            ch[i]=(char)('A'+j);
        }

        for (int i = 0; i < 4; i++) {
            int num=rand.nextInt(52)+10;
            c[i]=ch[num];
        }


        int num2=rand.nextInt(10);
        int num3=c.length-1;
        c[num3]=ch[num2];


        for (int i = 0; i < c.length; i++) {
            int index=rand.nextInt(c.length);
            char temp=c[i];
            c[i]=c[index];
            c[index]=temp;
        }
        String s1=new String(c);
        System.out.println(s1);

    }

}

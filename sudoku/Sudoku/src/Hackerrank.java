import java.util.*;

public class Hackerrank{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();

        String []s= new String[n];
        for(i=0;i<n;i++){
            s[i]=sc.nextLine();
        }

        for(i=0;i<4;i++){
            for(j=0;j<s[i].length();j++){
                if(s[i].charAt(j)=='>' && s[i].charAt(j+1)!='<'){
                    if(s[i].charAt(j+1)=='<' && s[i].charAt(j+2)=='/') break;
                    System.out.print(s[i].charAt(j));
                }
                System.out.println();
            }
        }
    }
}
import java.util.*;


public class text {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String b[]= sc.nextLine().split(" ");
        int x = Integer.parseInt(b[0]);
        int y = Integer.parseInt(b[1]);
        int n = Integer.parseInt(b[2]);
        int ucount=y-1;
        int dcount=0;
        int rcount=x-1;
        int lcount = 0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            String a=sc.nextLine();
            if(a.equals("U")&&ucount>=1){
                ucount--;
                dcount++;
            }
            else if(a.equals("D")&&dcount>=1){
                dcount--;
                ucount++;
            }
            else if(a.equals("R")&&rcount>=1){
                rcount--;
                lcount++;
            }
            else if(a.equals("L")&&lcount>=1){
                lcount--;
                rcount++;
            }
            else {
                 flag=false;
            }
        }
        if(flag){
             System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }
}
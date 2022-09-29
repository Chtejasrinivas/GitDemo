public class countWords {
    public static void main(String[] args) {
        String str=" Teja Srinivas";
        int wc=0;
        if(str!="") wc+=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
            {
                wc++;
            }
        }
        System.out.println(wc);
    }
}

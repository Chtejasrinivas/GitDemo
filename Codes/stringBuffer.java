class stringBuffer
{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        String s="Teja";
        String s1= " Srinivas";
        sb.append(s);
        System.out.println(sb);
        int n=sb.length();
        sb.insert(n,s1);
        System.out.println(sb);
        //System.out.println(sb.reverse());
        sb.append(" abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb);
        System.out.println(sb.capacity());

    }
}
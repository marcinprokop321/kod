public class Encoder
{
    public static String encode(String text,String Key)
    {
        String newText="";
        int dataIterator=0;
        Key = Key.toLowerCase();
        for(int i =0;i<text.length();i++)
        {
            if((text.charAt(i)>64&&text.charAt(i)<91)||(text.charAt(i)>96&&text.charAt(i)<123))
            {
                int temp4=text.charAt(i);
                boolean isBig=false;
                if(text.charAt(i)<93)
                {
                    isBig =true;
                    temp4+=32;
                }
                int temp = (temp4+Key.charAt(dataIterator%Key.length()));
                temp-=97*2;
                if(temp>25)
                    temp-=26;
                temp%=26;
                temp+=97;
                if(isBig)
                    temp-=32;
                String temp1 =String.valueOf((char) temp);
                newText+=temp1;
                dataIterator++;
            }
            else
            {
                newText+=text.charAt(i);

            }
        }
        return newText;
    }
}
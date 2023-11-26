import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("1 Decode, 2 Encode");
            int aha7=Integer.parseInt(scanner.nextLine());
            System.out.println("Text");
            String text = scanner.nextLine();
            System.out.println("Key");
            String key = scanner.nextLine();
            if(aha7==2)
                System.out.println(Encoder.encode(text,key));
            if(aha7==1)
                System.out.println(Decoder.decode(text,key));
        }
    }
}

package Day8;

public class Task8_1 {
    public static void main(String[] args) {
        String line = "";

        long start = System.currentTimeMillis();
        for (int i = 0; i<= 20000; i++){
            line = line + i + " ";
        }

        long end = System.currentTimeMillis();
        System.out.println("The processing time for String: " + (end-start));
        System.out.println(line);

        StringBuilder sb =new StringBuilder("");
        start = System.currentTimeMillis();
        for (int i =0; i<=20000; i++){
            sb =  sb.append(i).append(" ");
        }
        end = System.currentTimeMillis();
        System.out.println();
        System.out.println("The processing time for StringBuilder: " + (end-start));
        System.out.println(sb);

    }
}

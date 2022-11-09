public class Task2 {
    public static void main(String[] args){

        boolean first = true;   // is first word, for space formatting
        for(String s : args){
            // adds space if not the first word
            if (!first){ System.out.print(" "); }

            // iterate backwards through chars and print as we go
            int n = s.length();
            for (int i = (n-1); i >= 0; i--){
                System.out.print(s.charAt(i));
            }
            
            if (first){ first = false; }
        }
    }
}

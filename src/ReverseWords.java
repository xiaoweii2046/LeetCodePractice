public class ReverseWords {
    /*
    *2020/06/19
    *
     */
    public static String reverseWords(String s) {
        String reversedWords = "";
        String[] strs = s.split(" ",-1);
        for(String word: strs){
            for(int i = word.length()-1; i >= 0; i--){
                reversedWords = reversedWords + word.charAt(i);
            }

            reversedWords = reversedWords + " ";
        }
        reversedWords = reversedWords.substring(0,reversedWords.length()-1);
        return reversedWords;
    }
    public static void main(String args[]){
        String strs = " Let's take LeetCode contest ";
        System.out.println("The reverse words: "+reverseWords(strs)+".");
    }
}

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] strArray = s.split(" ");
        int lengthOfLastW = 0;
        if(strArray.length == 0)
            return lengthOfLastW;
        if(" ".equals(s.substring(s.length())))
            return lengthOfLastW;
        lengthOfLastW = strArray[strArray.length-1].length();
        return lengthOfLastW;
    }

    public static void main(String args[]){
        String strs = " ";
        System.out.println("The length of the last words: "+lengthOfLastWord(strs)+".");
    }
}

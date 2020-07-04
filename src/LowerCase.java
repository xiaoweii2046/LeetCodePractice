public class LowerCase {
    /***
     * String to lower case
     * @param str
     * @return String
     * 2020-06-28
     */
    public static String toLowerCase(String str) {
        String lowerCaseStr = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                lowerCaseStr = lowerCaseStr + (char)(str.charAt(i)+32);
            }
            else{
                lowerCaseStr = lowerCaseStr + str.charAt(i);
            }
        }
        return lowerCaseStr;
    }
    public static void main(String args[]){
        String strs = "Hello";
        System.out.println("The lower case words: "+toLowerCase(strs)+".");
    }
}

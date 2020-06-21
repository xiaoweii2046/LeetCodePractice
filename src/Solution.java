public class Solution {
     static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length != 0){
            for(int j = 0; j < strs[0].length(); j++){
                int count = strs.length-1;
                for(int i = 1; i < strs.length; i++){
                    if(strs[i].length() > j && strs[0].charAt(j) == strs[i].charAt(j)){
                        count--;
                    }
                    else if(j==0){
                        return prefix;
                    }
                }
                if(count == 0){
                    prefix = prefix + strs[0].charAt(j);
                }
            }
        }
        return prefix;
    }
    public static void main(String args[]){
        String[] strs = {"aca","cba"};
        System.out.println("The longest common prefix: "+longestCommonPrefix(strs));
    }
}

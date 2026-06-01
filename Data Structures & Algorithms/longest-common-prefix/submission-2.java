class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count=0;
        Arrays.sort(strs);
        String str1= strs[0];
        String str2= strs[strs.length-1];

        int l = Math.min(str1.length(),str2.length());

        for(int i=0;i<l;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                count++;
            }
            else
            break;
        }

        return str1.substring(0,count);

    }
}
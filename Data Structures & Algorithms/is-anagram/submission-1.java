class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;


        int charArr[] = new int[26];
        
        for(int i = 0 ; i < s.length(); i++){
            charArr[s.charAt(i) - 'a']++;
            charArr[t.charAt(i) - 'a']--;
        }

        if(Arrays.equals(charArr, new int[26]))
            return true;

        return false;
    }
}

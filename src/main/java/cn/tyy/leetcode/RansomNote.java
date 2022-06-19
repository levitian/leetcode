package cn.tyy.leetcode;

/**
 * leetcode 383. 赎金信
 */
public class RansomNote {

    /**
     * 自己实现的
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstructByMe(String ransomNote, String magazine) {

        byte[] ransomNotes = ransomNote.getBytes();
        for (byte note : ransomNotes) {
            String str = new String(new byte[]{note});
            if (magazine.contains(str)) {
                magazine = magazine.replaceFirst(str, "");
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * 官方题解
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length()){
            return false;
        }
        int[] count = new int[26];
        for(char c : magazine.toCharArray()){
            count[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            count[c - 'a']--;
            if(count[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        RansomNote rn = new RansomNote();
        //Boolean flag = rn.canConstructByMe("aa", "aab");
        Boolean flag = rn.canConstruct("aadfgdsfasdf", "aabsdfxcbhhssdf");
        System.out.println(flag);
        System.out.println(System.currentTimeMillis() - now);
    }
}

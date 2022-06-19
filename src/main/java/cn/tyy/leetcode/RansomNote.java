package cn.tyy.leetcode;

/**
 * leetcode 383. 赎金信
 *
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 *
 * 如果可以，返回 true ；否则返回 false 。
 *
 * magazine 中的每个字符只能在 ransomNote 中使用一次。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/ransom-note
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
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

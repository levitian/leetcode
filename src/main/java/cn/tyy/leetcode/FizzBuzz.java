package cn.tyy.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 2022-06-19
 * 412. Fizz Buzz
 * 给你一个整数 n ，找出从 1 到 n 各个整数的 Fizz Buzz 表示，并用字符串数组 answer（下标从 1 开始）返回结果，其中：
 *
 * answer[i] == "FizzBuzz" 如果 i 同时是 3 和 5 的倍数。
 * answer[i] == "Fizz" 如果 i 是 3 的倍数。
 * answer[i] == "Buzz" 如果 i 是 5 的倍数。
 * answer[i] == i （以字符串形式）如果上述条件全不满足。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/fizz-buzz
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FizzBuzz {

    /**
     * 自我实现
     * @param n
     * @return
     */
    public static List<String> fizzBuzzByMe(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3 == 0 && i%5 == 0){
                list.add("FizzBuzz");
            }else if(i%3 == 0){
                list.add("Fizz");
            }else if(i%5 == 0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    /**
     * 官方题解
     * @param n
     * @return
     */
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            StringBuffer sb = new StringBuffer();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            answer.add(sb.toString());
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(fizzBuzzByMe(15));;
    }
}

package cn.tyy.sort;

import java.util.Arrays;

public class QuickSort {
    /**
     * 快排算法
     * @param a 数组
     */
    public static void sort(int[] a){
        int lo=0; //左指针起始位置
        int hi=a.length-1; //右指针起始位置
        sort(a,lo,hi);

    }

    public static void sort(int[]a,int lo,int hi){
        if(lo>=hi){//安全校验，即递归出口
            return;
        }	//前序遍历
        int partition=partition(a,lo,hi); //排序并返回分界值交换后的索引
        //先排序，再切分！ 即前序遍历
        sort(a,lo,partition-1);
        sort(a,partition+1,hi);
    }

    private static int partition(int[] a, int lo, int hi) {
        //确定分界值
        int key=a[lo];
        //定义两个指针，分别指向分界值的索引处和最大索引处下一位
        int left=lo;
        int right=hi+1;
        //切分
        while(true) {
            //先右
            while (a[--right]>key) {//找的是right < key ，循环条件相反。
                if(right==lo){
                    break;}   // 越界，跳出while
            }
            //后左
            while(a[++left]<key){ //找的是left>key，循环条件相反
                if(left==hi){
                    break;   // 越界，跳出while
                }
            }
            if(left>=right){ //指针重合，跳出最外层循环
                break;
            }else{ //指针还未重合，则交换左、右指针处元素
                swap(a,left,right);
            }
        }
        swap(a,lo,right); //最后交换分界值和重合处元素
        return right; //返回分界值交换后的索引
    }

    public static void swap(int[] a,int lo,int hi){
        int k=a[lo];
        a[lo]=a[hi];
        a[hi]=k;
    }

    public static void main(String[] args) {
        int[]a={6, 1, 2, 7, 9, 3, 4, 5, 8};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}

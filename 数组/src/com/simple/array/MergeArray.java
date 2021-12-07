package com.simple.array;

import java.util.Arrays;

/**
 * 首先准备两个数组，他俩的长度是5-10之间的随机数
 * <p>
 * 然后准备第三个数组，第三个数组的长度是前两个的和
 * 通过System.arraycopy 把前两个数组合并到第三个数组中
 */
public class MergeArray {

    public static void main(String[] args) {
        int[] randomArray1 = getRandomArray(5);
        int[] randomArray2 = getRandomArray(7);
        System.out.println("随机数组1: " + Arrays.toString(randomArray1));
        System.out.println("随机数组2: " + Arrays.toString(randomArray2));
        int[] mergeArray = doMergeArray(randomArray1, randomArray2);
        System.out.println("合并后的数组: " + Arrays.toString(mergeArray));
    }

    /**
     * 生成随机数组
     *
     * @param size 数组容量
     * @return 返回一个int数组
     */
    private static int[] getRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int[] doMergeArray(int[] a, int[] b) {
        int[] mergeArray = new int[a.length + b.length];
        System.arraycopy(a, 0, mergeArray, 0, a.length);
        System.arraycopy(b, 0, mergeArray, a.length, b.length);
        return mergeArray;
    }
}

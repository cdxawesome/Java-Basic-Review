package com.simple.controlFlow;
/**
 * 寻找某两个数相除，其结果 离黄金分割点 0.618最近
 *
 * 分母和分子不能同时为偶数
 * 分母和分子 取值范围在[1-20]
 */
public class GoldenSectionRatio {
    public static void main(String[] args) {
        double offset = 10;
        double originalResult = 0.618;
        double targetResult, resultStore = 0;
        int iStore = 0, jStore = 0;
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i == j)
                    continue;
                if (i % 2 == 0 && j % 2 == 0)
                    continue;
                targetResult = (double) i / j;
                if (Math.abs(targetResult - originalResult) <= offset) {
                    offset = Math.abs(targetResult - originalResult);
                    // 保存i和j以及相除结果
                    iStore = i;
                    jStore = j;
                    resultStore = targetResult;
                }
            }
        }
        System.out.println("离黄金分割点(0.618)最近的两个数相处是:" + iStore + "/"
                + jStore + "=" + resultStore);
    }
}

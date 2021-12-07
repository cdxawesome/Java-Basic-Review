package com.simple.hash;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHAHash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // 创建一个MessageDigest实例
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        // 反复调用Update输入数据
        md.update("Hello".getBytes(StandardCharsets.UTF_8));
        md.update("World".getBytes(StandardCharsets.UTF_8));
        byte[] result = md.digest();
        System.out.println(new BigInteger(1,result).toString(16));
    }
}

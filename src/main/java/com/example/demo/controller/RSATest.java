package com.example.demo.controller;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.AsymmetricCrypto;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.system.SystemUtil;
import sun.misc.BASE64Decoder;

import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * @ProjectName: demo
 * @Package: com.example.demo.controller
 * @ClassName: RSATest
 * @Author: Deng YuBin
 * @Description:
 * @Date: 2021/1/6 15:42
 * @Version: 1.0
 */
public class RSATest {
    /**
     * @desc: 将字符串转换成RSAPublicKey类型
     * @date 2020-6-12 11:03:05
     * @param
     * @return
     */
    public static RSAPublicKey getRSAPublidKeyBybase64(String base64s) throws Exception {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec((new BASE64Decoder()).decodeBuffer(base64s));
        RSAPublicKey publicKey = null;
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        try {
            publicKey = (RSAPublicKey)keyFactory.generatePublic(keySpec);
        } catch (InvalidKeySpecException var4) {

        }
        return publicKey;
    }

    /**
     * @desc: 将字符串转换成RSAPrivateKey类型
     * @date 2020-6-12 11:03:01
     * @param
     * @return
     */
    public static RSAPrivateKey getRSAPrivateKeyBybase64(String base64s) throws Exception{
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec((new BASE64Decoder()).decodeBuffer(base64s));
        RSAPrivateKey privateKey = null;
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        try {
            privateKey = (RSAPrivateKey)keyFactory.generatePrivate(keySpec);
        } catch (InvalidKeySpecException var4) {
        }
        return privateKey;
    }

    public static void testXxx() throws Exception {

        AsymmetricCrypto asymmetricCrypto = new AsymmetricCrypto("RSA", getRSAPrivateKeyBybase64("私钥解密"),
                getRSAPublidKeyBybase64("公钥加密"));

        String s1 = asymmetricCrypto.encryptBase64("123456", KeyType.PublicKey);
        System.out.println(s1);

        String s = asymmetricCrypto.decryptStr(s1, KeyType.PrivateKey);
        System.out.println(s);

    }

    public static void main(String[] args) throws Exception {
        testXxx();
//        SecureUtil.aes();
//        SecureUtil.des();
    }
}

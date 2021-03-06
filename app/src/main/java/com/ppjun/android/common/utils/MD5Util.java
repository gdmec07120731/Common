package com.ppjun.android.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Package :com.ppjun.android.common.utils
 * Description :
 * Author :Rc3
 * Created at :2017/04/18 21:36.
 */

public class MD5Util {


    /*************************************************
     * MD5 算法的Java/JSP Bean JAVA/JSP MD5 Author: www.web745.com JAVA/JSP MD5
     * javabean 为免费发布，但转载请保留原作者信息，谢谢 Last Modified:10,Mar,2001 md5 类实现了RSA Data
     * Security, Inc.在提交给IETF 的RFC1321中的MD5 message-digest 算法
     *************************************************/


        /**
         * 默认的密码字符串组合，用来将字节转换�?16 进制表示的字�?apache校验下载的文件的正确性用的就是默认的这个组合
         */
        protected static char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6',
                '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

        protected static MessageDigest messagedigest = null;
        static {
            try {
                messagedigest = MessageDigest.getInstance("MD5");  // 获取md5 加密对象
            } catch (NoSuchAlgorithmException nsaex) {
                System.err.println(
                         "初始化失败，MessageDigest不支持MD5Util");
                nsaex.printStackTrace();
            }
        }

        /**
         * 生成字符串的md5校验
         *
         * @param s
         * @return
         */
        public static String getMD5String(String s) {
            return getMD5String(s.getBytes());
        }

        public   static  String getMD5String( byte [] bytes) {
            messagedigest.update(bytes);
            return  bufferToHex(messagedigest.digest());
        }

        private   static  String bufferToHex( byte  bytes[]) {
            return  bufferToHex(bytes,  0 , bytes.length);
        }

        private   static  String bufferToHex( byte  bytes[],  int  m,  int  n) {
            StringBuffer stringbuffer = new  StringBuffer( 2  * n);
            int  k = m + n;
            for  ( int  l = m; l < k; l++) {
                appendHexPair(bytes[l], stringbuffer);
            }
            return  stringbuffer.toString();
        }

        private   static   void  appendHexPair( byte  bt, StringBuffer stringbuffer) {
            char  c0 = hexDigits[(bt &  0xf0 ) >>  4 ]; // 取字节中�?4 位的数字转换, >>> 为�?辑右移，将符号位�?��右移,此处未发现两种符号有何不�?
            char  c1 = hexDigits[bt &  0xf ]; // 取字节中�?4 位的数字转换
            stringbuffer.append(c0);
            stringbuffer.append(c1);
        }
        public final static String getMessageDigest(byte[] buffer) {
            char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
            try {
                MessageDigest mdTemp = MessageDigest.getInstance("MD5");
                mdTemp.update(buffer);
                byte[] md = mdTemp.digest();
                int j = md.length;
                char str[] = new char[j * 2];
                int k = 0;
                for (int i = 0; i < j; i++) {
                    byte byte0 = md[i];
                    str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                    str[k++] = hexDigits[byte0 & 0xf];
                }
                return new String(str);
            } catch (Exception e) {
                return null;
            }

    }
}

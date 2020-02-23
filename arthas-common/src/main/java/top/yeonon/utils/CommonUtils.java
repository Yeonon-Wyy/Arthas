package top.yeonon.utils;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author yeonon
 * @date 2020/2/23 0023 15:47
 **/
@Slf4j
public class CommonUtils {

    /**
     * md5 encoding
     * @param originStr input string
     * @return md5 string
     */
    public static String md5(String originStr) {
        return DigestUtils.md5Hex(originStr);
    }

    /**
     * encoding sha1 with byte array
     * @param originByte byte array
     * @return sha1 string
     */
    public static String sha1(byte[] originByte) {
        return DigestUtils.sha1Hex(originByte);
    }

    /**
     * encoding sha1 with input stream
     * @param inputStream input stream
     * @return sha1 string
     */
    public static String sha1(InputStream inputStream) {
        try {
            return DigestUtils.sha1Hex(inputStream);
        } catch (IOException e) {
            log.error("encoding sha1 failed. error : " + e.getMessage());
        }
        return null;
    }


}

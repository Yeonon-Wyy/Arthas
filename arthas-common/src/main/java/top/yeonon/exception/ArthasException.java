package top.yeonon.exception;

import lombok.Data;

/**
 * @Author yeonon
 * @date 2020/2/23 0023 15:40
 **/
@Data
public class ArthasException extends Exception {

    private int code;

    public ArthasException(int code, String message) {
        super(message);
        this.code = code;
    }
}

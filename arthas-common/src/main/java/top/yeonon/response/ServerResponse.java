package top.yeonon.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yeonon
 * @date 2020/2/23 0023 15:16
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServerResponse<T> {

    private Integer code;

    private String message;

    T data;
}

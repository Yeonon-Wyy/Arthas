package top.yeonon.request;

/**
 * @Author yeonon
 * @date 2020/2/23 0023 15:33
 **/
public interface RequestVo {

    /**
     * check param
     * @return legal will return true, else return false, default return true(no validate logic)
     */
    default boolean validate() {
        return true;
    }
}

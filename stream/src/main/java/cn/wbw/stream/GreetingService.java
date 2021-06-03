package cn.wbw.stream;

import cn.hutool.json.JSONUtil;

/**
 * @author hyl
 * @date 2021/5/14 11:50
 */
@FunctionalInterface
public interface GreetingService {
    void hello(String massage);

}

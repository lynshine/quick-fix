package com.github.liuyueyi.fix.api.spi;

import com.github.liuyueyi.fix.api.constants.EndPoint;
import com.github.liuyueyi.fix.api.constants.LoaderOrder;
import com.github.liuyueyi.fix.api.modal.ReflectReqDTO;
import com.github.liuyueyi.fix.api.modal.OgnlReqDTO;

/**
 * 对外暴露的服务端点，接收外部的请求数据，并返回执行后的结果
 * - 一个常见的case就是开一个server服务，接收外部的json post请求
 *
 * Created by @author yihui in 17:08 18/12/29.
 */
@EndPoint
public interface FixEndPoint {

    /**
     * 返回优先级
     *
     * @return
     */
    default int order() {
        try {
            return this.getClass().getAnnotation(LoaderOrder.class).order();
        } catch (Exception e) {
            return 10;
        }
    }

    /**
     * 对外暴露的方法，接收外部的调用请求，并返回执行后的结果
     *
     * @param reqDTO
     * @return
     */
    String call(ReflectReqDTO reqDTO);

    /**
     * 对外暴露的方法，接收外部的ognl表达式，返回执行后的结果
     *
     * @param reqDTO
     * @return
     */
    String ognl(OgnlReqDTO reqDTO);
}

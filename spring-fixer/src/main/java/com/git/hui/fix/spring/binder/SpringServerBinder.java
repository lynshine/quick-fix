package com.git.hui.fix.spring.binder;

import com.git.hui.fix.api.loader.ServerLoader;
import com.git.hui.fix.api.spi.ServerLoaderBinder;
import com.git.hui.fix.spring.loader.BeanServerLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by @author yihui in 17:20 18/12/29.
 */
public class SpringServerBinder implements ServerLoaderBinder {
    @Override
    public List<ServerLoader> getBeanLoader() {
        List<ServerLoader> list = new ArrayList<>(10);
        list.add(BeanServerLoader.getLoader());
        return list;
    }
}

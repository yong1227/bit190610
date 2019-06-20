package com.bitcamp.web.common.lambda;

import java.util.function.Consumer;

/**
 * IConsumer
 */
@FunctionalInterface
public interface IConsumer {

    public abstract void accept(Object o);
        
    
}
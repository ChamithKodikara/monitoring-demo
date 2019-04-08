package com.helixz.monitoring.demo.component.actuator;

import org.springframework.boot.actuate.endpoint.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Chamith
 */
@Component
@Endpoint(id = "custom-endpoint")
public class CustomEndpoint {

    private Map<String, Integer> values = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Integer> values() {
        values.put("firstValue",1);
        values.put("secondValue",2);
        values.put("thirdValue",3);
        values.put("fourthValue",4);
        values.put("fifthValue",5);
        return values;
    }

    @ReadOperation
    public Object valueByName(@Selector String name) {
        return values.get(name);
    }

    @WriteOperation
    public void addValue(@Selector String name, Integer value) {
        values.put(name, value);
    }

    @DeleteOperation
    public void deleteValue(@Selector String name) {
        values.remove(name);
    }
}

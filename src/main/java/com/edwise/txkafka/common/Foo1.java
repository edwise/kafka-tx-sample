package com.edwise.txkafka.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo1 {

    private String foo;

    @Override
    public String toString() {
        return "Foo1 [foo=" + this.foo + "]";
    }

}
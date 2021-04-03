package com.test.van.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class HelloTest {
    @Test
    void name() {
        System.out.println("hello");

        assertThat("hello").isEqualTo("hello");
    }
}

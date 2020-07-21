package com.ioxua.error;

import com.ioxua.error.foo.Foo;
import com.ioxua.error.foo.FooService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@RequiredArgsConstructor

@SpringBootTest
class ErrorApplicationTests {

    private final FooService fooService;

    @Test
    public void fooRepoDelegateWorks() {
        fooService.save(new Foo());
    }

}

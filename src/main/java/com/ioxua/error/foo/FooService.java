package com.ioxua.error.foo;

import lombok.RequiredArgsConstructor;
import lombok.experimental.Delegate;
import org.springframework.stereotype.Service;

@Service

@RequiredArgsConstructor
public class FooService {

    @Delegate
    private final FooRepository fooRepository;

}

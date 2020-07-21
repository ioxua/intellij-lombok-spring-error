package com.ioxua.error.foo;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

@Getter
@NoArgsConstructor
public class Foo {

    @Id
    @GeneratedValue
    private Long id;

    @Basic
    private String bar;

}

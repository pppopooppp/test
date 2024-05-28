package com.wisform.entity;
import lombok.Data;
import org.neo4j.ogm.annotation.*;
import java.io.Serializable;
import javax.annotation.sql.DataSourceDefinition;
import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.io.Serializable;

@Data
@NodeEntity(label="Person")
public class Person implements Serializable {
    @Id @GeneratedValue
    private Long id;

    @Property
    private String name;

    @Property
    private String identity;

    @Property
    private String passwd;

    public Person(String name, String identity, String passwd) {
        this.name = name;
        this.identity = identity;
        this.passwd = passwd;
    }
    public String getPasswd(){
        return  passwd;
    }
}



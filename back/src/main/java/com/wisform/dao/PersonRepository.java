package com.wisform.dao;

import com.wisform.entity.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*@Repository//注解标记，表示这是一个 DAO 组件，用于访问数据存储。Spring 容器会自动扫描并加载这个 DAO 组件，并将其纳入到 Spring 的上下文中进行管理。
/*public interface PersonRepository extends Neo4jRepository<Person,Long>{
}
public interface PersonRepository extends Neo4jRepository<Person,Long>{
    boolean existsByName(String name);
}*/
@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {
    @Query("MATCH (p:Person) WHERE p.name = $name AND p.identity = $identity RETURN p")
    Optional<Person> findByNameAndIdentity(String name, String identity);
}

package com.wisformtest;
import org.neo4j.driver.*;
import com.wisform.dao.PersonRepository;
import com.wisform.entity.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;

@SpringBootTest
public class test1 {
        public static void main(String[] args) {
            String uri = "bolt://localhost:7687";
            String username = "neo4j";
            String password = "wangjia123";

            try (Driver driver = GraphDatabase.driver(uri, AuthTokens.basic(username, password))) {
                Session session = driver.session();
                Result result = session.run("MATCH (n) RETURN count(n) as count");
                System.out.println("Nodes count: " + result.single().get("count").asInt());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}


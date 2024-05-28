package com.wisform.controller;
import com.wisform.dao.PersonRepository;
import com.wisform.entity.ApiResponse;
import com.wisform.entity.LoginForm;
import com.wisform.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class LoginController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/api/login")
    public ResponseEntity<?> login(@RequestBody LoginForm form) {
        // 在这里处理接收到的表单数据
        String username = form.getUsername();
        String password = form.getPassword();
        String identity = form.getIdentity();

        // 打印接收到的用户名，用于调试
        Optional<Person> optionalPerson = personRepository.findByNameAndIdentity(username,identity);
        // 在这里进行登录验证逻辑，模拟简单的验证过程
        if (optionalPerson.isPresent()) {
            System.out.println(1);
            Person person = optionalPerson.get();
            System.out.println(person.getPasswd());
            if (person.getPasswd().equals(password))
                return ResponseEntity.ok().body(new ApiResponse(true, "登录成功"));
            else
                return ResponseEntity.ok().body(new ApiResponse(false, "密码错误"));
        } else {
            // 用户不存在，登录失败
            return ResponseEntity.ok().body(new ApiResponse(false, "用户名不存在"));
        }

    }
}

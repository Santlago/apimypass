package br.vom.fiap.mypass.password;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pass")
public class PasswordController {

    @Autowired
    PasswordService service;

    @GetMapping
    public List<Password> findAll() {
        return service.findAll();
    }
}

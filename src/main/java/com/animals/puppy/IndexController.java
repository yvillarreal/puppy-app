package com.animals.puppy;

import com.animals.puppy.entity.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String index() {
        Cliente cliente = new Cliente();
        return "Hello " + cliente.getNombre() + ". Fuiste creado el :" + cliente.getCreadoEl();
    }
}
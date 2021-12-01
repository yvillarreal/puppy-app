package com.animals.puppy.controller;

import com.animals.puppy.bussinesLayer.ClienteRepository;
import com.animals.puppy.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/clientes")
    public String cargarTodos(Model model) {
        List<Cliente> clienteList = clienteRepository.findAll();
        model.addAttribute("listClientes", clienteList);
        return String.valueOf(clienteRepository.findAll());

    }
}

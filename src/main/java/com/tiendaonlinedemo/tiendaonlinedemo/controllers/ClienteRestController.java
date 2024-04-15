package com.tiendaonlinedemo.tiendaonlinedemo.controllers;

import com.tiendaonlinedemo.tiendaonlinedemo.domain.Cliente;
import org.springframework.web.bind.annotation.*;
import java.util.NoSuchElementException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteRestController {

    private List<Cliente> clientes = new ArrayList<>(Arrays.asList(
            new Cliente("arm", "9612", "Diego Guerrero" ),
            new Cliente("Nahomy21", "1417", "Nahomy Odeth" ),
            new Cliente("felipe97", "9458", "Felipe Calderon" )
            )
    );

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){ return clientes; }

    // Este método maneja las solicitudes GET que llegan a la URL "/clientes/{userName}".
    @GetMapping("/clientes/{userName}")
    public Cliente getCliente(@PathVariable String userName){
        // Iteramos sobre la lista de clientes para buscar uno con el nombre de usuario proporcionado.
        for (Cliente cli : clientes) {
            // Verificamos si el nombre de usuario del cliente actual coincide con el proporcionado en la URL.
            if (cli.getUserName().equalsIgnoreCase(userName)){
                // Si encontramos un cliente con el nombre de usuario dado, lo devolvemos.
                return cli;
            }
        }
        // Si no se encuentra ningún cliente con el nombre de usuario dado, devolvemos null.
        return null;
    }

//    public Cliente getcliente(@PathVariable String userName){
//        // Utilizamos el método stream() en la lista de clientes para trabajar con ella de forma funcional.
//        // Luego, filtramos los clientes según el nombre de usuario proporcionado en la URL, sin distinguir mayúsculas y minúsculas.
//        // Usamos el método findFirst() para encontrar el primer cliente que cumpla con el filtro.
//        // Si no se encuentra ningún cliente, lanzamos una excepción NoSuchElementException.
//        return clientes.stream().
//                filter(cliente -> cliente.getUserName().equalsIgnoreCase(userName)).
//                findFirst().orElseThrow();
//    }

    @PostMapping("/clientes")
    public Cliente altaCliente(@RequestBody Cliente cliente){
        clientes.add(cliente);
        return cliente;
    }

}


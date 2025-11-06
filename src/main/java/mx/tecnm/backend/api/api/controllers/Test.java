package mx.tecnm.backend.api.api.controllers;

import mx.tecnm.backend.api.api.modells.Producto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello word";
    }

    @GetMapping("/producto")
    public Producto getProducto(){
        Producto producto = new Producto();
        producto.nombreProducto = "Yogurt Danone Fresa";
        producto.codigoBarras = "7588443100043";
        producto.precio = 12.0;

        return producto;
    }
}

package com.corhuila.Libreria.Controller;


import com.corhuila.Libreria.Documentos.Libro;
import com.corhuila.Libreria.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/libros")
public class LibroController {
    //Inyectar el servicio
    @Autowired
    private ILibroService service;

    @GetMapping()
    public List<Libro> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Libro> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping()
    public Libro save(@RequestBody Libro libro) {
        return service.save(libro);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Libro libro, @PathVariable String id) {
        service.update(libro, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}

package com.corhuila.Libreria_sql.Controller;

import com.corhuila.Libreria_sql.Entity.Libro;
import com.corhuila.Libreria_sql.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/cliente")
public class LibroController {
    //Inyectar el servicio
    @Autowired
    private ILibroService service;

    @GetMapping()
    public List<Libro> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Libro> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping()
    public Libro save(@RequestBody Libro libro) {
        return service.save(libro);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody Libro libro, @PathVariable Long id) {
        service.update(libro, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

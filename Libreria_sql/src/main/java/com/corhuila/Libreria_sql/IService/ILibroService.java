package com.corhuila.Libreria_sql.IService;

import com.corhuila.Libreria_sql.Entity.Libro;

import java.util.List;
import java.util.Optional;

public interface ILibroService {
    List<Libro> findAll(); // Devuelve una lista de clientes
    Optional<Libro> findById(Long id); // Devuelve un cliente por su id
    Libro save(Libro libro); // Guarda un libro
    void update(Libro libro, Long id); // Actualiza un libro
    void delete(Long id); // Elimina un cliente
}

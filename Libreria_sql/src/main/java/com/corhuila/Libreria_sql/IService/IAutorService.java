package com.corhuila.Libreria_sql.IService;

import com.corhuila.Libreria_sql.Entity.Autor;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    List<Autor> findAll(); // Devuelve una lista de facturas
    Optional<Autor> findById(Long id); // Devuelve un factura por su id
    Autor save(Autor autor); // Guarda un autor
    void update(Autor autor, Long id); // Actualiza un autor
    void delete(Long id); // Elimina un factura
}

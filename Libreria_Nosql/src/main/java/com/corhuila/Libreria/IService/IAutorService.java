package com.corhuila.Libreria.IService;

import com.corhuila.Libreria.Documentos.Autor;


import java.util.List;
import java.util.Optional;

public interface IAutorService {
    List<Autor> findAll(); // Devuelve una lista de facturas
    Optional<Autor> findById(String id); // Devuelve un factura por su id
    Autor save(Autor autor); // Guarda un autor
    void update(Autor autor, String id); // Actualiza un autor
    void delete(String id); // Elimina un factura
}

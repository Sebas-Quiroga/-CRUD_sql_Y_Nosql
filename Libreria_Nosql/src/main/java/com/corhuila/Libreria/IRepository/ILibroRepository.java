package com.corhuila.Libreria.IRepository;

;
import com.corhuila.Libreria.Documentos.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ILibroRepository extends MongoRepository<Libro, String> {

}

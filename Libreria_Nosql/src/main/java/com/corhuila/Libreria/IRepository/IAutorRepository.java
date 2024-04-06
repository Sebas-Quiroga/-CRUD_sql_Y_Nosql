package com.corhuila.Libreria.IRepository;


import com.corhuila.Libreria.Documentos.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface IAutorRepository extends  MongoRepository<Autor, String> {
}

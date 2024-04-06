package com.corhuila.Libreria_sql.IRepository;

import com.corhuila.Libreria_sql.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends JpaRepository<Libro, Long> {

}

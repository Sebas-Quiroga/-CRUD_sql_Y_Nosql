package com.corhuila.Libreria_sql.IRepository;

import com.corhuila.Libreria_sql.Entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Long> {
}

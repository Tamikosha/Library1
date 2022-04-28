package com.tamer.library.Repository;


import com.tamer.library.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {



}
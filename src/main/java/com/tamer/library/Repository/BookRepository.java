package com.tamer.library.Repository;

import java.util.List;

import com.tamer.library.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    public List<Book> findByNameIgnoreCaseContaining(String name);

}
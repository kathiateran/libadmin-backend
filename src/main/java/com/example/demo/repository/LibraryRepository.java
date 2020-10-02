package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Book;


public interface LibraryRepository extends JpaRepository<Book, Long> {
  List<Book> findByReserved(boolean reserved);
  List<Book> findByTitleContaining(String title);
}
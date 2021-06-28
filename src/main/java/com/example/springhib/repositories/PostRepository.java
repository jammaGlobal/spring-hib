package com.example.springhib.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springhib.models.Post;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

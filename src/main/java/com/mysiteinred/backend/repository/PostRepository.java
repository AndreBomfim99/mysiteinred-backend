package com.mysiteinred.backend.repository;

import com.mysiteinred.backend.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

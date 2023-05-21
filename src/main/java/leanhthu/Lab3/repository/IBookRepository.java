package leanhthu.Lab3.repository;

import org.springframework.stereotype.Repository;
import leanhthu.Lab3.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface IBookRepository extends JpaRepository<Book , Long>{
}

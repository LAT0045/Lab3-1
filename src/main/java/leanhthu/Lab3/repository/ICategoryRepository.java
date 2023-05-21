package leanhthu.Lab3.repository;

import org.springframework.stereotype.Repository;
import leanhthu.Lab3.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ICategoryRepository extends JpaRepository<Category ,Long >{
}

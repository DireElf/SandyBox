package sandy.auto.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import sandy.auto.models.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query(value = "SELECT * FROM courses", nativeQuery = true)
    Page<Course> findAllWithStudents(Pageable pageable);

    boolean existsByTitle(String noCourse);
}

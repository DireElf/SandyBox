package sandy.auto.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sandy.auto.models.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Page<Student> findByCourseId(Long courseId, PageRequest pageRequest);
}

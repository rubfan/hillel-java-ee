package ua.od.hillel.repository;

/**
 * Created by ruslangramatic on 5/26/18.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.od.hillel.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
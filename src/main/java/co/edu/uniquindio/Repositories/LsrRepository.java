package co.edu.uniquindio.Repositories;

import co.edu.uniquindio.model.LSR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LsrRepository extends JpaRepository<LSR, Long > {
}

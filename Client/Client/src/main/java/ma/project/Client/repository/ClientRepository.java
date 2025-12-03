package ma.project.Client.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.project.Client.entities.Client;



@Repository
public interface ClientRepository extends JpaRepository<Client, Long> { }

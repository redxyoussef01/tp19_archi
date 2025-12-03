package ma.project.SERVICE_VOITURE.Repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ma.project.SERVICE_VOITURE.entities.Client;

@FeignClient(name="SERVICE-CLIENT")
public interface ClientService{
    @GetMapping(path="/clients/{id}")
    Client clientById(@PathVariable Long id);
}
package rentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rentApp.domain.Apartment;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {

}

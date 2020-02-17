package br.com.sulamerica.gerenciamento.usuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sulamerica.gerenciamento.usuarios.modelo.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long>{

}

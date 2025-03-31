package br.com.BitBytecommerce.Api.repository;
import br.com.BitBytecommerce.Api.models.Empresas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EmpresasRepository extends JpaRepository<Empresas, Long> {
}

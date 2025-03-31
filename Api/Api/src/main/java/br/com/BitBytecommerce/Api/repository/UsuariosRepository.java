package br.com.BitBytecommerce.Api.repository;
import br.com.BitBytecommerce.Api.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuariosRepository extends JpaRepository<Usuarios,Long> {
}

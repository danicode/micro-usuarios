package com.servicio.usuarios.models.dao;

import com.servicio.usuarios.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

//@RepositoryRestResource(path="usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {
    //@RestResource(path="buscar-username")
    public Usuario findByUsername(@Param("username") String username);

    @Query("select u from Usuario u where u.username=?1")
    public Usuario obtenerPorUsername(String username);
}

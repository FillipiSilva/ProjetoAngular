package org.generation.brazil.angular_crud.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Modifying
    @Transactional
    @Query(value = "update Pessoa p set p.nome = :nome where p.id = :id")
    void updateNome(@Param("nome") String nome, @Param("id") Long id);

}

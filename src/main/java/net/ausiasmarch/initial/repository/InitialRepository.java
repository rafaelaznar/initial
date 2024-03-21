package net.ausiasmarch.initial.repository;

import net.ausiasmarch.initial.entity.InitialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InitialRepository extends JpaRepository<InitialEntity, Long> {

}

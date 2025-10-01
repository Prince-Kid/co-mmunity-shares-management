package org.rehoboth.repository;

import org.rehoboth.model.Contributions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContibutionRepository  extends JpaRepository<Contributions, Integer>
{
}
package org.rehoboth.repository;

import org.rehoboth.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendenceRepository   extends JpaRepository<Attendance, Integer>
{
}
package com.citnova.sca.repository;

import java.sql.Timestamp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.citnova.sca.domain.Notificacion;

public interface NotificacionRepository extends JpaRepository<Notificacion, Integer>{

	public Page<Notificacion> findByStatus(String statusNot, Pageable pageable);
	public Page<Notificacion> findByFhCreaBetweenAndVisibilidad(Timestamp from, Timestamp to, String visibilidad, Pageable pageable);
}

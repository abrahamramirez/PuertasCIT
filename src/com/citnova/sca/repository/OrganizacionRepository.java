package com.citnova.sca.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.citnova.sca.domain.Organizacion;

public interface OrganizacionRepository extends CrudRepository<Organizacion, Integer> {

	public List<Organizacion> findBySiglasOrgLike (String siglasOrg);
}

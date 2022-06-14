package in.lrisd.bhunakshanew.common.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.lrisd.bhunakshanew.common.entity.Vvvv;

@Repository
public class VvvvRepository implements VvvvDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Vvvv> findAll() {
		String sqlQuery = "SELECT gis_code, village_en, village_hi, vsrno, mapscale, geotransform, georefpoints,"
				+ " st_astext(wkb_geometry) wkb_geometry, scale_units, fmbstatus, default_scale, fmbswversion, ulpin_generated"
				+ "	FROM vvvv";

		Query query =  entityManager.createNativeQuery(sqlQuery, Vvvv.class);
		return query.getResultList();
	}

	@Override
	public Vvvv findByBhucode(String gis_code) {
		String sqlQuery = "SELECT gis_code, village_en, village_hi, vsrno, mapscale, geotransform, georefpoints,"
				+ " st_astext(wkb_geometry) wkb_geometry, scale_units, fmbstatus, default_scale, fmbswversion, ulpin_generated"
				+ "	FROM vvvv where gis_code=:gis_code";
		
		return (Vvvv) entityManager.createNativeQuery(sqlQuery, Vvvv.class).setParameter("gis_code", gis_code)
				.getSingleResult();
	}

	@Override
	public List<Vvvv> findByPattern(String pattern) {
		String sqlQuery = "SELECT gis_code, village_en, village_hi, vsrno, mapscale, geotransform, georefpoints,"
				+ " st_astext(wkb_geometry) wkb_geometry, scale_units, fmbstatus, default_scale, fmbswversion, ulpin_generated"
				+ "	FROM vvvv where gis_code like :gis_code";
		
		return entityManager.createNativeQuery(sqlQuery, Vvvv.class).setParameter("gis_code", pattern+"%").getResultList();	
	}

	@Override
	public List<Vvvv> findByVsrno(String vsrno) {
		String sqlQuery = "SELECT gis_code, village_en, village_hi, vsrno, mapscale, geotransform, georefpoints,"
				+ " st_astext(wkb_geometry) wkb_geometry, scale_units, fmbstatus, default_scale, fmbswversion, ulpin_generated"
				+ "	FROM vvvv where vsrno=:vsrno";
		
		return entityManager.createNativeQuery(sqlQuery, Vvvv.class).setParameter("vsrno", vsrno).getResultList();
	}
}

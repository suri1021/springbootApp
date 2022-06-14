package in.lrisd.bhunakshanew.common.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.lrisd.bhunakshanew.common.entity.Khasramap;
import in.lrisd.bhunakshanew.common.globalsettings.TablePartition;

@Repository
public class KhasramapRepository implements KhasramapDAO{

	private EntityManager entityManager;
	
	@Autowired
	public KhasramapRepository(EntityManager entityManager)
	{
		this.entityManager = entityManager;
	}

	@Override
	public List<Khasramap> findAllByBhucode(String state, String bhucode) {
		String tableid = TablePartition.getTablePartitionId("Khasramap", state, bhucode);
		String sqlQuery = "Select Cast(id as varchar) id" + "," 
				          +"st_astext(wkb_geometry) wkb_geometry, bhucode, kide, Cast(div_id as varchar) div_id, attributes,"
				          +"last_updated, attributes_json, pniu, pnil, interior_point, ulpin_generation_date, ulpin_mode,"
				          +"signature,signkey,dscno,signdate,attributesjson,attributejson"
				          + " from " + tableid + " where bhucode=:bhucode order by kide";

		Query query =  entityManager.createNativeQuery(sqlQuery, Khasramap.class);	
		query.setParameter("bhucode", bhucode);
		List<Khasramap> theList = query.getResultList();
		return theList;
	}

	@Override
	public Khasramap findByBhucodeKide(String state, String bhucode, String kide) {
		String tableid = TablePartition.getTablePartitionId("Khasramap", state, bhucode);
		String sqlQuery = "Select Cast(id as varchar) id" + "," 
				          +"st_astext(wkb_geometry) wkb_geometry, bhucode, kide, Cast(div_id as varchar) div_id, attributes,"
				          +"last_updated, attributes_json, pniu, pnil, interior_point, ulpin_generation_date, ulpin_mode,"
				          +"signature,signkey,dscno,signdate,attributesjson,attributejson"
				          + " from " + tableid + " where bhucode=:bhucode and kide=:kide order by kide";

		Query query =  entityManager.createNativeQuery(sqlQuery, Khasramap.class);	
		query.setParameter("bhucode", bhucode);
		query.setParameter("kide", kide);
		List<Khasramap> theList = query.getResultList();
		if (theList.size() > 0) return theList.get(0);
		return null;
	}

	@Override
	public Khasramap findById(String id) {
		Khasramap khasramap =  entityManager.find(Khasramap.class, id);
		
		return khasramap;
	}
}

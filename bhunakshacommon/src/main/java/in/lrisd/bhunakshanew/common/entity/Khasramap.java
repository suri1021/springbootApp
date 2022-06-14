package in.lrisd.bhunakshanew.common.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.annotation.JsonIgnore;

import in.lrisd.bhunakshanew.common.usertype.JSONBDataUserType;

/**
 * The persistent class for the khasramap database table.
 * 
 */
@Entity
@TypeDef(name = "JsonDataUserType", typeClass = JSONBDataUserType.class)
@Table(name = "Khasramap")
public class Khasramap {
	
	public Khasramap() {
	}

	@Id
	@Column(columnDefinition = "uuid", updatable = false)
	@GeneratedValue(generator = "uuid")
	private String id;
	
	@Column(name="wkb_geometry")
	private String wkbGeometry;
	
	@Column(name="bhucode")
	private String bhucode;
	
	@Column(name="kide")
	private String kide;
	
	@Column(name="div_id")
	private String divId;
	
	@JsonIgnore
	@Column(name="attributes")
	private String attributes;

	@Column(name="last_updated")
	private Timestamp lastUpdated;
		
	@Type(type = "JsonDataUserType")
	@Column(name="attributes_json")
	private String attributes_json;
	
	@Column(name="pniu")
	private String pniu;
	
	@JsonIgnore
	@Column(name="pnil")
	private String pnil;
	
	@Column(name="interior_point")
	private String interiorPoint;
	
	@Column(name="ulpin_generation_date")
	private Timestamp ulpinGenerationDate;

	@Column(name="ulpin_mode")
	private String ulpinMode;
	
	@JsonIgnore
	@Column(name="signature")
	private String signature;
	
	@JsonIgnore
	@Column(name="signkey")
	private String signkey;

	@JsonIgnore
	@Column(name="dscno")
	private String dscno;
	
	@JsonIgnore
	@Column(name="signdate")
	private Timestamp signdate;

	@Type(type = "JsonDataUserType")
	@Column(name="attributesjson")
	private String attributesjson;
	
	@Column(name="attributejson")
	private String attributejson;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWkbGeometry() {
		return wkbGeometry;
	}

	public void setWkbGeometry(String wkbGeometry) {
		this.wkbGeometry = wkbGeometry;
	}

	public String getBhucode() {
		return bhucode;
	}

	public void setBhucode(String bhucode) {
		this.bhucode = bhucode;
	}

	public String getKide() {
		return kide;
	}

	public void setKide(String kide) {
		this.kide = kide;
	}

	public String getDivId() {
		return divId;
	}

	public void setDivId(String divId) {
		this.divId = divId;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getAttributes_json() {
		return attributes_json;
	}

	public void setAttributes_json(String attributes_json) {
		this.attributes_json = attributes_json;
	}

	public String getPniu() {
		return pniu;
	}

	public void setPniu(String pniu) {
		this.pniu = pniu;
	}

	public String getPnil() {
		return pnil;
	}

	public void setPnil(String pnil) {
		this.pnil = pnil;
	}

	public String getInteriorPoint() {
		return interiorPoint;
	}

	public void setInteriorPoint(String interiorPoint) {
		this.interiorPoint = interiorPoint;
	}

	public Timestamp getUlpinGenerationDate() {
		return ulpinGenerationDate;
	}

	public void setUlpinGenerationDate(Timestamp ulpinGenerationDate) {
		this.ulpinGenerationDate = ulpinGenerationDate;
	}

	public String getUlpinMode() {
		return ulpinMode;
	}

	public void setUlpinMode(String ulpinMode) {
		this.ulpinMode = ulpinMode;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSignkey() {
		return signkey;
	}

	public void setSignkey(String signkey) {
		this.signkey = signkey;
	}

	public String getDscno() {
		return dscno;
	}

	public void setDscno(String dscno) {
		this.dscno = dscno;
	}

	public Timestamp getSigndate() {
		return signdate;
	}

	public void setSigndate(Timestamp signdate) {
		this.signdate = signdate;
	}

	public String getAttributesjson() {
		return attributesjson;
	}

	public void setAttributesjson(String attributesjson) {
		this.attributesjson = attributesjson;
	}

	public String getAttributejson() {
		return attributejson;
	}

	public void setAttributejson(String attributejson) {
		this.attributejson = attributejson;
	}
}
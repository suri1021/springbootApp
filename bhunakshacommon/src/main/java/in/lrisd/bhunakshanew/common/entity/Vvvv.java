package in.lrisd.bhunakshanew.common.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name ="vvvv")
public class Vvvv {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gis_code")
	private String gisCode;

	@Column(name="default_scale", nullable = true, columnDefinition = "double default 0.0")
	private Double defaultScale = 0.0;

	private String fmbstatus;

	private String fmbswversion;

	private String georefpoints;

	private String geotransform;

	private BigDecimal mapscale;

	@Column(name="scale_units")
	private String scaleUnits;

	@Column(name="ulpin_generated")
	private String ulpinGenerated;

	@Column(name="village_en")
	private String villageEn;

	@Column(name="village_hi")
	private String villageHi;

	private String vsrno;

	@Column(name="wkb_geometry")
	private String wkbGeometry;

	public Vvvv() {
	}

	public String getGisCode() {
		return this.gisCode;
	}

	public void setGisCode(String gisCode) {
		this.gisCode = gisCode;
	}

	public double getDefaultScale() {
		return this.defaultScale;
	}

	public void setDefaultScale(double defaultScale) {
		this.defaultScale = defaultScale;
	}

	public String getFmbstatus() {
		return this.fmbstatus;
	}

	public void setFmbstatus(String fmbstatus) {
		this.fmbstatus = fmbstatus;
	}

	public String getFmbswversion() {
		return this.fmbswversion;
	}

	public void setFmbswversion(String fmbswversion) {
		this.fmbswversion = fmbswversion;
	}

	public String getGeorefpoints() {
		return this.georefpoints;
	}

	public void setGeorefpoints(String georefpoints) {
		this.georefpoints = georefpoints;
	}

	public String getGeotransform() {
		return this.geotransform;
	}

	public void setGeotransform(String geotransform) {
		this.geotransform = geotransform;
	}

	public BigDecimal getMapscale() {
		return this.mapscale;
	}

	public void setMapscale(BigDecimal mapscale) {
		this.mapscale = mapscale;
	}

	public String getScaleUnits() {
		return this.scaleUnits;
	}

	public void setScaleUnits(String scaleUnits) {
		this.scaleUnits = scaleUnits;
	}

	public String getUlpinGenerated() {
		return this.ulpinGenerated;
	}

	public void setUlpinGenerated(String ulpinGenerated) {
		this.ulpinGenerated = ulpinGenerated;
	}

	public String getVillageEn() {
		return this.villageEn;
	}

	public void setVillageEn(String villageEn) {
		this.villageEn = villageEn;
	}

	public String getVillageHi() {
		return this.villageHi;
	}

	public void setVillageHi(String villageHi) {
		this.villageHi = villageHi;
	}

	public String getVsrno() {
		return this.vsrno;
	}

	public void setVsrno(String vsrno) {
		this.vsrno = vsrno;
	}

	public String getWkbGeometry() {
		return this.wkbGeometry;
	}

	public void setWkbGeometry(String wkbGeometry) {
		this.wkbGeometry = wkbGeometry;
	}
}
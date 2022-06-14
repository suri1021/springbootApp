package in.lrisd.bhunakshanew.common.dialect;
/*
 * package com.suren.dev.cruddemo.dialect;
 * 
 * import java.sql.Types;
 * 
 * import org.hibernate.boot.model.TypeContributions; import
 * org.hibernate.dialect.PostgreSQL10Dialect; import
 * org.hibernate.service.ServiceRegistry; import
 * org.hibernate.type.descriptor.sql.SqlTypeDescriptor; import
 * org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;
 * 
 * import com.suren.dev.cruddemo.usertype.UUIDStringCustomType;
 * 
 * public class CustomPostgresDialect extends PostgreSQL10Dialect{ public
 * CustomPostgresDialect() { this.registerColumnType(Types.JAVA_OBJECT,
 * "jsonb"); }
 * 
 * @Override public void contributeTypes(TypeContributions typeContributions,
 * ServiceRegistry serviceRegistry) {
 * super.contributeTypes(typeContributions,serviceRegistry);
 * typeContributions.contributeType(new UUIDStringCustomType());
 * 
 * registerHibernateType(1111, "string"); }
 * 
 * @Override public SqlTypeDescriptor remapSqlTypeDescriptor(SqlTypeDescriptor
 * sqlTypeDescriptor) { switch (sqlTypeDescriptor.getSqlType()) { case
 * Types.CLOB: return VarcharTypeDescriptor.INSTANCE; case Types.BLOB: return
 * VarcharTypeDescriptor.INSTANCE; case 1111://1111 should be json of pgsql
 * return VarcharTypeDescriptor.INSTANCE; } return
 * super.remapSqlTypeDescriptor(sqlTypeDescriptor); } }
 */
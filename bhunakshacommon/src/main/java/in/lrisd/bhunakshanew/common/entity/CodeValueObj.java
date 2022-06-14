package in.lrisd.bhunakshanew.common.entity;

import java.util.HashMap;
import java.util.Map;

public class CodeValueObj {
    private String code;
    private String value;
    private Map extraParms;
    private Object object;
    private boolean toStringIsCode=false;
    private boolean toStringIsValue=false;
    public static final String DEFAULT_PARM_CODE="extraParm";
    
    public CodeValueObj() {
    }   
    
    public CodeValueObj(String code, String value) {
        this.code = code;
        this.value = value;
    }
    
    public CodeValueObj(String code, String value, boolean toStringIsCode) {
        this.code = code;
        this.value = value;
        this.toStringIsCode=toStringIsCode;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public boolean isToStringIsCode() {
        return toStringIsCode;
    }

    public void setToStringIsCode(boolean toStringIsCode) {
        this.toStringIsCode = toStringIsCode;
    }

    public boolean isToStringIsValue() {
        return toStringIsValue;
    }

    public void setToStringIsValue(boolean toStringIsValue) {
        this.toStringIsValue = toStringIsValue;
    }
       
     public CodeValueObj(String code, String value, String oneExtraParm) {
        this.code = code;
        this.value = value;
        setExtraParm(DEFAULT_PARM_CODE, oneExtraParm);
    }

    public CodeValueObj(String code, String value, Map extraParms) {
        this.code = code;
        this.value = value;
        this.extraParms = extraParms;
        
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map getExtraParms() {
        return extraParms;
    }

    public void setExtraParms(Map extraParms) {
        this.extraParms = extraParms;
    }
    
    public Object getExtraParm(){
      return  getExtraParm(DEFAULT_PARM_CODE);
    }
   
    public Object getExtraParm(String parmCode){
        if(extraParms==null) return null;
        return  extraParms.get(parmCode);
    }
    
     public final void setExtraParm( Object parmValue){
       setExtraParm(DEFAULT_PARM_CODE,parmValue);
    }
    
    public final void setExtraParm(String parmCode, Object parmValue){
        if(extraParms==null){
            extraParms = new HashMap();
        }
        extraParms.put(parmCode, parmValue);
    }
    
    @Override
    public String toString() {
        if(toStringIsCode){
            return getCode();
        }
        else if(toStringIsValue){
            return getValue();
        }
        else{
            return getCode()+ " "+getValue();
        }
    }
}

package com.cib.crypto.abe.parser;

import lombok.Getter;

@Getter
public class ParserVo {

    /**
     * integer value of this 'union'
     */
    public int intVal;

    /**
     * double value of this 'union'
     */
    public double doubleVal;

    /**
     * string value of this 'union'
     */
    public String strVal;

    /**
     * object value of this 'union'
     */
    public Object obj;

    public ParserVo() {
    }
    public ParserVo(int val)
    {
        this.intVal=val;
    }

    /**
     * Initialize me as a double
     */
    public ParserVo(double val)
    {
        this.doubleVal=val;
    }

    /**
     * Initialize me as a string
     */
    public ParserVo(String val)
    {
        this.strVal=val;
    }

    /**
     * Initialize me as an Object
     */
    public ParserVo(Object val)
    {
        this.obj=val;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public void setDoubleVal(double doubleVal) {
        this.doubleVal = doubleVal;
    }

    public void setStrVal(String strVal) {
        this.strVal = strVal;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "ParserVo{" +
                "intVal=" + intVal +
                ", doubleVal=" + doubleVal +
                ", strVal='" + strVal + '\'' +
                ", obj=" + obj +
                '}';
    }
}

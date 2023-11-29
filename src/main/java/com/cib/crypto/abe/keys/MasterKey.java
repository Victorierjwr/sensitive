package com.cib.crypto.abe.keys;


import com.cib.crypto.abe.serialize.Serializable;
import com.cib.crypto.abe.serialize.SimpleSerializable;
import it.unisa.dia.gas.jpbc.Element;

public class MasterKey implements SimpleSerializable {
	@Serializable(group="Zr")
	public Element beta;
	
	@Serializable(group="G2")
	public Element g_alpha;
}

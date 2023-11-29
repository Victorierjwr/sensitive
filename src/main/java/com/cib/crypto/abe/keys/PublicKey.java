package com.cib.crypto.abe.keys;

import com.cib.crypto.abe.serialize.Serializable;
import com.cib.crypto.abe.serialize.SimpleSerializable;
import it.unisa.dia.gas.jpbc.Element;

public class PublicKey implements SimpleSerializable {
	@Serializable(group="G1")
	public Element g; // G1 generator
	
	@Serializable(group="G2")
	public Element gp; // G2 generator
	
	@Serializable(group="GT")
	public Element g_hat_alpha; // GT
	
	@Serializable(group="G1")
	public Element h; //G1

}

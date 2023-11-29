package com.cib.crypto.abe.keys;

import com.cib.crypto.abe.serialize.Serializable;
import com.cib.crypto.abe.serialize.SimpleSerializable;
import it.unisa.dia.gas.jpbc.Element;

public class SecretKey implements SimpleSerializable {
	@Serializable(group="G2")
	public Element D;
	
	@Serializable
	public SKComponent[] comps;
	
	 public static class SKComponent implements SimpleSerializable{
		@Serializable
		public String attr;
		@Serializable(group="G2")
		public Element Dj;
		@Serializable(group="G2")
		public Element _Dj;
	}
}

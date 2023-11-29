package com.cib.crypto.abe.policy;



import com.cib.crypto.abe.serialize.Serializable;
import com.cib.crypto.abe.serialize.SimpleSerializable;
import it.unisa.dia.gas.jpbc.Element;

import java.util.List;

public class Policy implements SimpleSerializable {
	/* serialized */
	@Serializable
	public int k;            /* one if leaf, otherwise threshold */
	@Serializable
	public String attr;       /* attribute string if leaf, otherwise null */
	@Serializable(group="G1")
	public Element Cy;      /* G_1, only for leaves */
	@Serializable(group="G1")
	public Element _Cy;     /* G_1, only for leaves */
//	List<Policy> children; /* pointers to bswabe_policy_t's, len == 0 for leaves */
	@Serializable
	public Policy[] children;
	
	/* only used during encryption */
	public transient Polynomial q;

	/* only used during decryption */
	public transient int satisfiable;
	public transient int min_leaves;
	public transient int attri;
	public transient List<Integer> satl;
}
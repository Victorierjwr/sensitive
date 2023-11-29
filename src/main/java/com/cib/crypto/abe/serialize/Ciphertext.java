package com.cib.crypto.abe.serialize;

import com.cib.crypto.abe.policy.Policy;
import com.cib.crypto.abe.serialize.Serializable;
import com.cib.crypto.abe.serialize.SimpleSerializable;
import it.unisa.dia.gas.jpbc.Element;

public class Ciphertext implements SimpleSerializable {
    @Serializable
    public Policy p;
    @Serializable(group="GT")
    public Element Cs; //GT
    @Serializable(group="G1")
    public Element C;  //G1
}

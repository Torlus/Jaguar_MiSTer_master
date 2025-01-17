package com.torlus.jnl.entities;

import com.torlus.jnl.Entity;
import com.torlus.jnl.Instance;
import com.torlus.jnl.Signal;
import com.torlus.jnl.SignalType;

public class Buf extends Entity {
	@Override
	public String getBaseName() {
		return null;
	}

	public Buf() {
		ios.add(new Signal("z", SignalType.OUT));
		ios.add(new Signal("a", SignalType.IN));
	}

	@Override
	public String vhdlInstance(Instance inst) {
		String vhdl = "$z$ <= $a$;\n";
		return vhdlMap(inst, vhdl);
	}

	@Override
	public String verilogInstance(Instance inst) {
		String vlog = "assign $z$ = $a$;\n";
		return verilogMap(inst, vlog);
	}

}

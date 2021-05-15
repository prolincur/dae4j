package com.dddviewr.collada.states;

import org.xml.sax.Attributes;

import com.dddviewr.collada.Accessor;
import com.dddviewr.collada.Source;
import com.dddviewr.collada.State;
import com.dddviewr.collada.StateManager;

public class accessor extends State {
	protected Accessor theAccessor;

	public void init(String name, Attributes attrs, StateManager mngr) {
		super.init(name, attrs, mngr);
		this.theAccessor = new Accessor(attrs.getValue("source"), Integer
				.parseInt(attrs.getValue("count")), Integer.parseInt(attrs
				.getValue("stride")));
		Source source = ((source) getParent().getParent()).getSource();
		source.setAccessor(this.theAccessor);
	}

	public Accessor getAccessor() {
		return this.theAccessor;
	}
}
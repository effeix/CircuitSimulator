package model;

import java.util.ArrayList;

abstract class LogicGate implements Source, Drain {
	protected ArrayList <InputPin> pins = new ArrayList <>();
}

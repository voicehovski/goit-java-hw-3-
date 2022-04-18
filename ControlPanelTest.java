class ControlPanel {

	private Altimeter altimeter = new Altimeter ();
	private AirGauge airGauge = new AirGauge ();

	public void control (  ) {
		System .out .println ( altimeter );
		System .out .println ( airGauge );
	}
}

class AirGauge {
	@Override
	public String toString () {
		return "Measure air pressure";
	}
}

class Altimeter {
	@Override
	public String toString () {
		return "Measure height";
	}
}

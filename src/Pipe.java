/*
 * Esta es una clase que es una tubería que tiene el número de la tubería y la cantidad de agua que dicha tubería contiene,
 * la voy a usar para ver como se vácia una tubería y pasa a la siguiente para que se vacie también
 */
public class Pipe implements Runnable {
	protected Well well;
	protected int pipenumber;
	protected int water;

	public Pipe(Well well, int pipenumber, int water) {
		super();
		this.well = well;
		this.pipenumber = pipenumber;
		this.water = water;
	}

	public Pipe(int pipenumber, int water) {
		super();
		this.pipenumber = pipenumber;
		this.water = water;

	}

	public Well getWell() {
		return well;
	}

	public void setWell(Well well) {
		this.well = well;
	}

	public Pipe(int water) {
		super();
		this.water = water;
	}

	public Pipe() {
		super();
	}

	public int getPipenumber() {
		return pipenumber;
	}

	public void setPipenumber(int pipenumber) {
		this.pipenumber = pipenumber;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public void sacarAguaDelPozo() {
		if (well.getWater() <= getWater()) {
			System.out.println("No hay agua suficiente en el pozo");
		} else {
			well.setWater(well.getWater() - 1);

		}
	}

	// En el metodo run que se ejecuta al iniciar el hilo tenemos para que vaya
	// sacando el agua de la tubería hasta que se vacie.
	public void run() {
		if (well != null && well.getWater() > this.water) {

			for (int i = 0; this.water > 0; this.water--) {

				well.setWater(well.getWater() - 1);
				System.out.println("Pipe numero " + getPipenumber() + " Cantidad de agua: " + getWater()
						+ " Agua actual en el pozo: " + well.getWater());
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					// TODO: handle exception
				}

			}

		} else if (well == null) {
			for (int i = 0; this.water > 0; this.water--) {
				System.out.println("Pipe numero " + getPipenumber() + " Cantidad de agua: " + getWater());
				try {
					Thread.sleep(300);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}

		} else {
			System.out.println("No hay agua suficiente en el pozo para llenar la tubería, la tubería necesita: "
					+ getWater() + " de agua en el pozo para funcionar y actualmente hay: " + getWater());
		}

	}

	@Override
	public String toString() {
		return "Pipe [water=" + water + "]";
	}

}

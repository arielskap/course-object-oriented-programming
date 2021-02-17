class Main {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		UberX uberX = new UberX("AMQ123", new Account("Ariel Villarreal", "ABD123"), "Chrevrolet", "Sonic");
		uberX.setPassenger(4);
		uberX.printDataCar();

		UberVan uberVan = new UberVan("MFN234", new Account("Ariel Villarreal", "ABD123"));
		uberVan.setPassenger(6);
		uberVan.printDataCar();
		// Car car2 = new Car("QWE567", new Account("Andrea Herrera", "JBL213"));
		// car2.passenger = 3;
		// car2.printDataCar();
	}

}
public class Car {
    private String currentColor; // Farbe des Autos
    private String brand; // Marke des Autos
    private int horsePower; // PS des Autos

    public void drive() {
        System.out.println("Das Auto fährt.");
    }

        public String getCurrentColor() {
            return currentColor;
        }
        public void setCurrentColor(String currentColor) {
            this.currentColor = currentColor;
        }
        public String getBrand() {
            return brand;
        }
        public void setBrand(String brand) {
            this.brand = brand;
        }
        public int getHorsePower() {
            return horsePower;
        }
        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }


}

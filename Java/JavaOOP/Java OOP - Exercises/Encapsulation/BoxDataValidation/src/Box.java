public class Box {
    private double length;
    private double width;
    private double height;

    public Box (double length, double width, double height){
        setLength(length);
        setWidth(width);
        setHeight(height);

    }

    private void setLength(double length){
        if ( length <= 0 ){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width){
        if ( width <= 0 ){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height){
        if ( height <= 0 ){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    private double getLength(){
        return this.length;
    }

    private double getWidth(){
        return this.width;
    }

    private double getHeight(){
        return this.height;
    }

    public double calculateSurfaceArea(){
        double surfaceArea =
                (2 * this.length * this.width) + (2 * this.length * this.height) + (2 * this.width * this.height);
        return surfaceArea;
    }

    public double calculateLateralSurfaceArea(){
        double lateralSurfaceArea =
                (2 * this.length * this.height) + (2 * this.width * this.height);
        return lateralSurfaceArea;
    }

    public double calculateVolume(){
        double volume = this.length * this.width * this.height;
        return volume;
    }



}

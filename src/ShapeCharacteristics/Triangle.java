package ShapeCharacteristics;

class Triangle implements Shape {
    private double sidea;
    private double sideb;
    private double sidec;
    private String fillColor;
    private String borderColor;

    public Triangle(double sidea, double sideb, double sidec, String fillcolor, String borderColor) {
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
        this.fillColor = fillcolor;
        this.borderColor = borderColor;
    }
    public double getPerimeter() {
        return sidea + sideb + sidec;
    }
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - sidea) * (s - sideb) * (s - sidec));

    }
    public String getFillColor() {
        return fillColor;
    }
    public String getBorderColor() {
        return borderColor;
    }
}


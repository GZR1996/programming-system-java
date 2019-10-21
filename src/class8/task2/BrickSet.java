package class8.task2;

import java.util.Objects;

public class BrickSet {
    private int num;
    private String name;
    private String theme;
    private int numOfPieces;
    private double retailPrice;

    public BrickSet() {

    }

    public BrickSet(int num, String name, String theme, int numOfPieces, double retailPrice) {
        this.num = num;
        this.name = name;
        this.theme = theme;
        this.numOfPieces = numOfPieces;
        this.retailPrice = retailPrice;
    }

    public double getPricePerPiece() {
        return retailPrice / numOfPieces;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNumOfPieces() {
        return numOfPieces;
    }

    public void setNumOfPieces(int numOfPieces) {
        this.numOfPieces = numOfPieces;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BrickSet brickSet = (BrickSet) o;
        return num == brickSet.num &&
                numOfPieces == brickSet.numOfPieces &&
                Double.compare(brickSet.retailPrice, retailPrice) == 0 &&
                Objects.equals(name, brickSet.name) &&
                Objects.equals(theme, brickSet.theme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, name, theme, numOfPieces, retailPrice);
    }

    @Override
    public String toString() {
        return "BrickSet{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", theme='" + theme + '\'' +
                ", numOfPieces=" + numOfPieces +
                ", retailPrice=" + retailPrice +
                '}';
    }
}

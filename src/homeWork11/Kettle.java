package homeWork11;

public class Kettle implements Comparable <Kettle> {
    private int rating;
    private int price;
    private int discountPrice;
    private String name;

    public Kettle() {
    }

    public Kettle(int rating, int price, int discountPrice, String name) {
        this.rating = rating;
        this.price = price;
        this.discountPrice = discountPrice;
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kettle kettle = (Kettle) o;

        if (rating != kettle.rating) return false;
        if (price != kettle.price) return false;
        if (discountPrice != kettle.discountPrice) return false;
        return name != null ? name.equals(kettle.name) : kettle.name == null;
    }

    @Override
    public int hashCode() {
        int result = rating;
        result = 31 * result + price;
        result = 31 * result + discountPrice;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "rating=" + rating +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Kettle kettle) {
        if (this.price != kettle.price){
            return this.price-kettle.price;
        }
        if (this.discountPrice != kettle.discountPrice){
            return  this.discountPrice - kettle.discountPrice;
        }
        if (this.rating != kettle.rating){
            return  this.rating-kettle.rating;
        }

        return 0;
    }
}

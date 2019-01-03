public class Pizza {
    public enum Sauce {
        TOMATO,
        PESCATORA,
        MARINARA,
    }

    private final Size size;
    private final Sauce sauce;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.sauce = builder.sauce;
    }

    public String getInfo() {
        return String.format("size: %s, sauce: %s\n", this.size.toString(), this.sauce.toString());
    }

    public static class Builder {
        private static Size size;
        private static Sauce sauce;

        public Builder setSize(int diameter) {
           this.size = new Size(diameter);
           return this;
        }

        public Builder setSauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

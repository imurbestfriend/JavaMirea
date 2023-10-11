package fourthPrac.one;

public class one {
    public enum seasons {
        winter(-10, "Cold"),
        spring(15,"Warm"),
        summer(30,"Hot"),
        autumn(10,"Rainy");

        private int temperature;
        private String description;



        private seasons(int temperature, String description) {
            this.temperature = temperature;
            this.description = description;
        }

        public int getTemperature() {
            return temperature;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        seasons favoriteSeasons = seasons.spring;
        System.out.println("Favorite season is " + favoriteSeasons + " " + favoriteSeasons.getTemperature() + " " + favoriteSeasons.getDescription());

        two two = new two();
        two.processEnumValue(seasons.summer);
        for (seasons elem : seasons.values()) {
            System.out.println(elem + " " + elem.description + " " + elem.temperature);
        }
    }
}

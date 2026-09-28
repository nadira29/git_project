package week08.ArraysPractice;

public class CountriesArray {

    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",
                "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                "Honduras", "Indonesia", "United States"
        };

        String shortest = countries[0];
        String longest = countries[0];

        for (String country : countries) { // for each country in countries array
            char firstLetter = country.charAt(0);
            char lastLetter = country.charAt(country.length() - 1);

            System.out.println(country + "first letter: " + firstLetter + ", last letter: " + lastLetter);

            if (country.startsWith("C")){ // if country starts with C
                System.out.println(" Starts with C: " + country);
            }

            if (country.length() < shortest.length()) { // if country length is less than shortest country length
                shortest = country;
            }

            if (country.length() > longest.length()) { // if country length is greater than longest country length
                longest = country;
            }

            System.out.println("\nShortest country name: " + shortest + "\nlongest country name: " + longest + "");
        }



    }


}

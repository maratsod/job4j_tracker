package ru.job4j.stream;

public class Pokemon {

    private String name;
    private int number;
    private int level;
    private double height;
    private double weight;
    private String type;
    private String gender;

    static class Builder {
        private String name;
        private int number;
        private int level;
        private double height;
        private double weight;
        private String type;
        private String gender;

        Pokemon.Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Pokemon.Builder buildNumber(int number) {
            this.number = number;
            return this;
        }

        Pokemon.Builder buildLevel(int level) {
            this.level = level;
            return this;
        }

        Pokemon.Builder buildHeight(double height) {
            this.height = height;
            return this;
        }

        Pokemon.Builder buildWeight(double weight) {
            this.weight = weight;
            return this;
        }

        Pokemon.Builder buildType(String type) {
            this.type = type;
            return this;
        }

        Pokemon.Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        Pokemon build() {
            Pokemon pokemon = new Pokemon();
            pokemon.name = name;
            pokemon.number = number;
            pokemon.level = level;
            pokemon.height = height;
            pokemon.weight = weight;
            pokemon.type = type;
            pokemon.gender = gender;
            return pokemon;
    }
}

    @Override
    public String toString() {
        return "Pokemon:"
                + " Name = " + name
                + ", Number = " + number
                + ", Level = " + level
                + ", Height = " + height
                + ", Weight = " + weight
                + ", Type = " + type
                + ", Gender = " + gender;
    }

    public static void main(String[] args) {
        Pokemon pokemon = new Builder().buildName("Pikachu")
                .buildNumber(25)
                .buildLevel(50)
                .buildHeight(0.4)
                .buildWeight(6.0)
                .buildType("Electric")
                .buildGender("Female")
                .build();
        System.out.println(pokemon);
    }

}
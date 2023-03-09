public class add_toy {
    public Integer id_toy;
    public String name_toy;
    public int all_value;
    public int random;

    public add_toy(Integer id_toy, String name_toy, int all_value, int random) {
        this.id_toy = id_toy;
        this.name_toy = name_toy;
        this.all_value = all_value;
        this.random = random;

    }

    public Integer getId_toy() {
        return id_toy;
    }

    public String getName_toy() {
        return name_toy;
    }

    public int getAll_value() {
        return all_value;
    }

    public int getRandom() {
        return random;
    }

    @Override
    public String toString() {
        return "Toy_choise [id_toy=" + id_toy + ", name_toy=" + name_toy + ", all_value=" + all_value + ", random="
                + random
                + "]";
    }

    
    }


package telda.restservice;

public class Region {
    private int id;
    private String name;
    private String short_name;

//    public Region() {}
////    public Region(int id, String name, String short_name){
////        this.id = id;
////        this.name = name;
////        this.short_name = short_name;
////    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", short_name='" + short_name + '\'' +
                '}';
    }
}

package Data;

public class BinaryTuple {
    private Integer first;
    private Integer second;

    public BinaryTuple(Integer first, Integer second){
        this.first = first;
        this.second = second;
    }

    public Integer getFirst(){
        return this.first;
    }

    public Integer getSecond(){
        return this.second;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }
}

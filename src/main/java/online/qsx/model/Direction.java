package online.qsx.model;


public class Direction {

    private Integer directionId;

    private String direction_name;

    public Integer getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    public String getDirection_name() {
        return direction_name;
    }

    public void setDirection_name(String direction_name) {
        this.direction_name = direction_name;
    }

    public Direction(Integer directionId, String direction_name) {
        this.directionId = directionId;
        this.direction_name = direction_name;
    }

    public Direction(String direction_name) {
        this.direction_name = direction_name;
    }

    public Direction(Integer directionId) {
        this.directionId = directionId;
    }

    public Direction() {

    }

    @Override
    public String toString() {
        return "Direction{" +
                "directionId=" + directionId +
                ", direction_name='" + direction_name + '\'' +
                '}';
    }
}

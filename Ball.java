public class Ball {
    
    // add missing instance variables
    private String name;
    
    public Ball () {

    }
    
    public Ball(Boolean isBBall) {

    }
    
    public Ball(String ballMaterial, Double ballWeight, Boolean isBBall, String ballName) {

    }
    
    public void setName(String ballName) {
        name = ballName;
    }
    
    public void setWeight(Double ballWeight) {
        weight = ballWeight;
    }
    
    public void setMaterial(String ballMaterial) {
        material = ballMaterial;
    }
    
    public void setIsBasketball(Boolean isBBall) {
        isBasketball = isBBall;
    }
    
    public Double getWeight() {
        return weight;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public Boolean getIsBasketball() {
        return isBasketball;
    }
    
    public String getName() {
        return name;
    }
}
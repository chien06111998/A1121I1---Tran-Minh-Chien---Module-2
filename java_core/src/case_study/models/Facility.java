package case_study.models;

public abstract class Facility {
    //Cơ sở vật chất.
    public abstract void roomStandard(); //tiêu chuẩn phòng
    public abstract double poolArea(); // diện tích hồ bơi
    public abstract int numberOfFloors(); // số tầng
    public abstract void freeService(); // dịch vụ miễn phí đi kèm
}

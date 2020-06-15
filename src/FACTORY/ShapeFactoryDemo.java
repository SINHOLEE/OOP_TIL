package FACTORY;

//shape interface

interface Shape{
	public void draw();
}

//각각 도형의 생성 구현클래스

class Circle implements Shape{
	public void draw(){
     System.out.println("동그라미 그려요");
 }
}

class Rectangle implements Shape{
	public void draw(){
     System.out.println("네모 그려요");
 }
}

class Triangle implements Shape{
	public void draw(){
     System.out.println("세모 그려요");
 }
}

class StrangeShape implements Shape{
	public void draw(){
     System.out.println("이상한 모양을 그려요");
 }
}


class ShapeFactory{
 public Shape create(String type) {
     if(type.equals("circle")){
         return new Circle();
     } else if (type.equals("rectangle")){
         return new Rectangle();
     } //else if (type.equals("strangeShape")) {    	 
    	// return new StrangeShape();
     //}
     else{
         return new Triangle();
     }
 }
}

public class ShapeFactoryDemo {
	public static void main(String[] args){
     ShapeFactory shapeFactory = new ShapeFactory();
     
     // 동그라미 그리기
     Shape circle = shapeFactory.create("circle");
     circle.draw(); // "동그라미 그려요"
     
     // 세모 그리기
     Shape triangle = shapeFactory.create("triangle");
     triangle.draw(); // "세모 그려요"
     
//     // 세모 그리기
//     Shape strangeShape = shapeFactory.create("strangeShape");
//     strangeShape.draw(); // "세모 그려요"
//     
     
 }
}
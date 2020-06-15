package FACTORY;

//shape interface

interface Shape{
	public void draw();
}

//���� ������ ���� ����Ŭ����

class Circle implements Shape{
	public void draw(){
     System.out.println("���׶�� �׷���");
 }
}

class Rectangle implements Shape{
	public void draw(){
     System.out.println("�׸� �׷���");
 }
}

class Triangle implements Shape{
	public void draw(){
     System.out.println("���� �׷���");
 }
}

class StrangeShape implements Shape{
	public void draw(){
     System.out.println("�̻��� ����� �׷���");
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
     
     // ���׶�� �׸���
     Shape circle = shapeFactory.create("circle");
     circle.draw(); // "���׶�� �׷���"
     
     // ���� �׸���
     Shape triangle = shapeFactory.create("triangle");
     triangle.draw(); // "���� �׷���"
     
//     // ���� �׸���
//     Shape strangeShape = shapeFactory.create("strangeShape");
//     strangeShape.draw(); // "���� �׷���"
//     
     
 }
}
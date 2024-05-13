package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the number of shape: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Shape #" + i + " data: ");
			System.out.print("Retangle or Circle? (R/C)");
			char ch = sc.next().charAt(0);
			System.out.print("Color: ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double Width = sc.nextDouble();
				System.out.print("Height: ");
				double Height = sc.nextDouble();
				list.add(new Retangle(color, Width, Height));
			} else {
				System.out.print("Radius: ");
				double Radius = sc.nextDouble();
				list.add(new Circle(color, Radius));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));

		}

		sc.close();
	}
}

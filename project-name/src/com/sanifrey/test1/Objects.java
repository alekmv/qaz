/**
 * Устанавливаем принадлежность класса к пакету
 */
package com.sanifrey.test1;

public class Objects {
	/**
	 * Объявляем приватные переменные.
	 * width - значение ширины объекта.
	 * length - значение длины объекта.
	 * area - значение площади занимаемаемой объектом.
	 */
	private  float width = 0;
	private  float length = 0;
	private float area = 0;
	
	/**
	 * Геттер для получения значения ширины объекта.
	 */
	public float getWidth() {
		return width;
	}
	/**
	 * Сеттер для указания значения ширины объекта.
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	/**
	 * Геттер для получения значения длины объекта.
	 */
	public float getLength() {
		return length;
	}
	/**
	 * Сеттер для указания значения длины объекта.
	 */
	public void setLength(float length) {
		this.length = length;
	}
	/**
	 * Геттер для получения значения занимаемой площади объектом.
	 */
	public float getArea() {
		return area;
	}
	/**
	 * Сеттер для указания значения занимаемой площади объектом.
	 */
	public void setArea(float area) {
		this.area = area;
	}
}
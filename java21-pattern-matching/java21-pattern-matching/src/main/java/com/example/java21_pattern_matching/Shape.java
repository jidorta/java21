package com.example.java21_pattern_matching;

public sealed interface Shape permits Circle, Rectangle {}

record Circle(double radius) implements Shape{}
record Rectangle(double length, double width) implements Shape{}



package com.shrralis.prototype;

/**
 * Prototype
 */
public abstract class Prototype implements Cloneable {

    public abstract Object copy() throws CloneNotSupportedException;
}

package com.shrralis.prototype;

/**
 * Warlord
 */
public abstract class Warlord extends Prototype {

    @Override
    public abstract Warlord copy() throws CloneNotSupportedException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zsolt
 * @param <T>
 */
public interface Rendezheto<T> {
    public boolean egyenlo(T t);
    public boolean nagyobbMint(T t);
    public boolean kisebbMint(T t);  
}

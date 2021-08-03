/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cameraprototype;

/**
 *
 * @author LENOVO
 */
public abstract class Camera implements Cloneable{
    private String id;
    public String type;
    public String harga;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getHarga() {
        return harga;
    }
    
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
            return clone;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cameraprototype;

import java.util.Hashtable;

/**
 *
 * @author LENOVO
 */
public class CameraCache {
    private static Hashtable<String, Camera> cameraMap = new Hashtable<String, Camera>();
    
    public static Camera getCamera(String cameraId) {
        Camera cachedCamera = cameraMap.get(cameraId);
        return (Camera) cachedCamera.clone();
    }

    public static void loadCache() {
        Analog analog = new Analog();
        analog.setId("1");
        cameraMap.put(analog.getId(),analog);

        Instan instan = new Instan();
        instan.setId("2");
        cameraMap.put(instan.getId(),instan);

        DSLR dslr = new DSLR();
        dslr.setId("3");
        cameraMap.put(dslr.getId(), dslr);
    }
}

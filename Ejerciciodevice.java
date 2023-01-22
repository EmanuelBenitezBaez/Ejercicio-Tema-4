package CLASES;
/*
En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
Agregaréis atributos tal cual tendrían esos objetos en la realidad.
Crear constructor vacío y con todos los parámetros para cada clase.
Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
*/
class SmartDevice {
    private String name;
    private String brand;
    private String os;
    private int storage;
    private int battery;

    public SmartDevice() {
    }

    public SmartDevice(String name, String brand, String os, int storage, int battery) {
        this.name = name;
        this.brand = brand;
        this.os = os;
        this.storage = storage;
        this.battery = battery;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public int getStorage() {
        return storage;
    }

    public int getBattery() {
        return battery;
    }
}

class SmartPhone extends SmartDevice {


    public SmartPhone() {
    }

    public SmartPhone(String name, String brand, String os, int storage, int battery, String phoneNumber) {
        super(name, brand, os, storage, battery);

    }


}

class SmartWatch extends SmartDevice {


    public SmartWatch() {
    }

    public SmartWatch(String name, String brand, String os, int storage, int battery) {
        super(name, brand, os, storage, battery);

    }


     }
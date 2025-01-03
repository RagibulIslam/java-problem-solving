package com.example.finalquestionsolve;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class VehicleStorage {
    private static final String FILE_PATH ="Vehicle.bin";
    private static void saveVehicleList(List<Vehicle>vehicleList)throws IOException{
        try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(FILE_PATH))){
            oos.writeObject(vehicleList);


        }



    }
    public static List<Vehicle> loadVehicleList(){
        List<Vehicle> vehicleList=new ArrayList<>();
        File file =new File(FILE_PATH);

        if (file.exists()){
            try (ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file))){
                vehicleList=(List<Vehicle>) ois.readObject();
            }catch (IOException|ClassNotFoundException e){

            }
        }
        return vehicleList;


    }
    public static void addVehicle (Vehicle vehicle) throws IOException{
        List<Vehicle> vehicleList= loadVehicleList();
        vehicleList.add(vehicle);
        saveVehicleList(vehicleList);

    }








}

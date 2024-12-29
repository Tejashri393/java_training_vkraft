package vkraft_java_training_Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Room {
    private String roomNumber;
    private String roomType;
    private boolean isAvailable;
    private double pricePerNight;

   
    public Room(String roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true; 
        this.pricePerNight = pricePerNight;
    }

    
    public String getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    
    public void bookRoom() {
        isAvailable = false;
    }

    
    public void freeRoom() {
        isAvailable = true;
    }
}


class Hotel {
    private List<Room> rooms;

   
    public Hotel() {
        rooms = new ArrayList<>();
        
        rooms.add(new Room("101", "Single", 100.0));
        rooms.add(new Room("102", "Double", 150.0));
        rooms.add(new Room("103", "Suite", 250.0));
        rooms.add(new Room("104", "Single", 100.0));
        rooms.add(new Room("105", "Double", 150.0));
    }

    
    public void displayAvailableRooms() {
        System.out.println("\n--- Available Rooms ---");
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println("Room Number: " + room.getRoomNumber() + " | Type: " + room.getRoomType() + " | Price: $" + room.getPricePerNight());
            }
        }
    }

    
    public boolean checkRoomAvailability(String roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                return room.isAvailable();
            }
        }
        return false; 
    }

   
    public boolean bookRoom(String roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                if (room.isAvailable()) {
                    room.bookRoom();
                    System.out.println("Room " + roomNumber + " has been successfully booked.");
                    return true;
                } else {
                    System.out.println("Sorry, room " + roomNumber + " is already booked.");
                    return false;
                }
            }
        }
        System.out.println("Room not found.");
        return false;
    }

    
    public double calculateCharges(String roomNumber, int nights) {
        for (Room room : rooms) {
            if (room.getRoomNumber().equals(roomNumber)) {
                return room.getPricePerNight() * nights;
            }
        }
        return 0; // Room not found
    }
}


public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        
        
        hotel.displayAvailableRooms();

        
        System.out.print("\nEnter the room number to book: ");
        String roomNumber = scanner.nextLine();

        
        if (hotel.bookRoom(roomNumber)) {
            
            System.out.print("Enter the number of nights: ");
            int nights = scanner.nextInt();
            
            
            double totalCharges = hotel.calculateCharges(roomNumber, nights);
            System.out.println("Total charges for " + nights + " nights: $" + totalCharges);
        }

        scanner.close();
    }
}


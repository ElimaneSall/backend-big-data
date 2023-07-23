package com.example.backendweather;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tester {

    private static double calculateAverageTemperature(List<Climat> climatList) {
        if (climatList.isEmpty()) {
            return 0.0;
        }
        // Calculer la moyenne de température pour l'heure donnée
        double sum = 0.0;
        for (Climat c : climatList) {
            sum += c.getTemperature().doubleValue(); // Assurez-vous que vous avez une méthode getTemperature() dans la classe Climat pour obtenir la valeur de la température
        }
        return sum / climatList.size();
    }
    public static void main(String[] args) throws ParseException {
        ClimatImpl climat = new ClimatImpl();

        LogImpl log = new LogImpl();

        LogEntity logEntity  = new LogEntity( Timestamp.valueOf("2023-07-04 09:18:47"),"absence", "Probleme de connexion", "non resolu");

        log.saveLog(logEntity);
//        Climat climat1 = new Climat(
//
//                Timestamp.valueOf("2023-07-04 03:37:05"),
//                10000,
//                Timestamp.valueOf("2023-07-04 09:18:47"),
//                "Clouds",
//                new BigDecimal("23.010000000000048"),
//                Timestamp.valueOf("2023-07-04 09:18:47"),
//                new BigDecimal("19.410000000000025"),
//                1015,
//                Timestamp.valueOf("2023-07-04 09:18:57"),
//                1015,
//                Timestamp.valueOf("2023-07-04 19:03:19"),
//                new BigDecimal("21.629999999999995"),
//                75,
//                35,
//                932,
//                new BigDecimal("2.4622902"));

//        climat.saveClimat(climat1);


//        List<Climat> climats = climat.getAllTemperatureToday();
//        for (Climat c : climats) {
//            // Faites ce que vous voulez avec les données récupérées
//            System.out.println("Climat ID: " + c.getId());
//            // ...
//        }

        // Convertir une heure en objet Date pour tester
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date hourToRetrieve;
//        try {
//            hourToRetrieve = dateFormat.parse("2023-07-17 19:32:57"); // Remplacez cette heure par l'heure souhaitée
//        } catch (ParseException e) {
//            System.err.println("Erreur lors de la conversion de l'heure : " + e.getMessage());
//            return;
//        }
//
//        // Appeler la fonction getAllDataPerHour() pour récupérer les données pour l'heure spécifiée
//        List<Climat> climatList = climat.getAllDataPerHour(hourToRetrieve);
//
//        // Afficher les données récupérées
//        for (Climat c : climatList) {
//            System.out.println("Heure de collecte : " + c.getTimeCollecte() + ", Température : " + c.getTemperature());
//        }


        Date currentHour = new Date();
        Date hourToRetrieve;

        // Convertir l'heure actuelle en format "HH"
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        String currentHourString = hourFormat.format(currentHour);

        // Créer le dictionnaire pour stocker les températures par heure
        Map<String, Double> temperatureByHour = new TreeMap<>(); // TreeMap pour trier les résultats par heure

        // Pour chaque heure de 00h jusqu'à l'heure actuelle
        for (int hour = 0; hour <= Integer.parseInt(currentHourString); hour++) {
            // Définir l'heure dans le calendrier
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(currentHour);
            calendar.set(Calendar.HOUR_OF_DAY, hour);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);

            // Récupérer la date correspondant à l'heure donnée

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            hourToRetrieve = dateFormat.parse("2023-07-22 7:32:57");
//            Date hourDate = calendar.getTime();
            // Vérifier si des données Climat sont disponibles pour l'heure donnée
            Map<String, Double> climatList = climat.getAllDataPerHour();
            System.out.println("Date>>" +climatList );


//            System.out.println(temperatureByHour);
        }


    }
    }


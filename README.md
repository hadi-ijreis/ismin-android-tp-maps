# ismin-android-tp-maps

Part of Android Development - ISMIN 2020

Course followed by students of Mines St Etienne, ISMIN - M2 Computer Science.

[![Mines St Etienne](./logo.png)](https://www.mines-stetienne.fr/)

# TP6: Google Maps

## 📝 Goal

The goal is to discover Google Apis mechanism by displaying a few markers on a map.

First:
- Create a new Android project

- Login to https://console.cloud.google.com
- Create a new project
- Navigate to "API et services" and then "Identifiants"
- Create a new API Key
- Add some restriction for this key

Notes: If you don't want to create a Google account ask the teacher for a demo API Key

Then: 
- Add a layout to display the map fragment in `activity-main.xml`
- Instantiate a `SupportMapFragment` in `MainActivity` and display it
- Make `MainActivity` implements the `OnMapReadyCallback` interface
- Do not forget to call the `getMapAsync` method on the map fragment
- Add a marker on Gardanne
- Move the map to Gardanne

## 🛰 Extra 

Use the Android Location API to get the last known location and display it with a custom marker on the map

References:
  - https://developer.android.com/training/location/permissions
  - https://developer.android.com/training/location/retrieve-current

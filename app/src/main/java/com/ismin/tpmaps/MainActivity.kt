package com.ismin.tpmaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val supportMapFragment: SupportMapFragment = SupportMapFragment.newInstance()

        supportMapFragment.getMapAsync(this)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.map_layout, supportMapFragment)
        fragmentTransaction.commit()
    }

    override fun onMapReady(gmap: GoogleMap) {
        val gardanne: LatLng = LatLng(43.4526, 5.4717)
        gmap.addMarker(
            MarkerOptions()
                .position(gardanne)
                .title("Gardanne")
                .snippet("HQ des ISMIN")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker))
        )

        gmap.moveCamera(CameraUpdateFactory.newLatLng(gardanne))
    }
}
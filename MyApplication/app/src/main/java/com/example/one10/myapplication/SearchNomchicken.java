package com.example.one10.myapplication;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class SearchNomchicken extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);

        FragmentManager fragmentManager = getFragmentManager();
        MapFragment mapFragment = (MapFragment)fragmentManager
                .findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap map) {

        LatLng NOM = new LatLng(37.608207, 126.999004);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(NOM);
        markerOptions.title("놈치킨");
        markerOptions.snippet("서울특별시 성북구 정릉로8길 73");
        map.addMarker(markerOptions);

        map.moveCamera(CameraUpdateFactory.newLatLng(NOM));
        map.animateCamera(CameraUpdateFactory.zoomTo(15));
    }

}
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


public class SearchHalMae extends AppCompatActivity
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

        LatLng Go = new LatLng(37.608198, 127.003860);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(Go);
        markerOptions.title("할매순대국");
        markerOptions.snippet("서울특별시 성북구 정릉로 169");
        map.addMarker(markerOptions);

        map.moveCamera(CameraUpdateFactory.newLatLng(Go));
        map.animateCamera(CameraUpdateFactory.zoomTo(15));
    }

}
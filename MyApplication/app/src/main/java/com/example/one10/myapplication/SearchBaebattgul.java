package com.example.one10.myapplication;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class SearchBaebattgul extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);

        Log.d("SearchBaebattgul","(로그 메시지) onCreate 실행.");
        FragmentManager fragmentManager = getFragmentManager();
        MapFragment mapFragment = (MapFragment)fragmentManager
                .findFragmentById(R.id.googleMap);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap map) {

        Log.d("SearchBaebattgul","(로그 메시지) onMapReady 실행.");

        LatLng Bae = new LatLng(37.608179, 126.999802);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(Bae);
        markerOptions.title("배밭골");
        markerOptions.snippet("서울특별시 성북구 정릉3동 892-9");
        map.addMarker(markerOptions);

        map.moveCamera(CameraUpdateFactory.newLatLng(Bae));
        map.animateCamera(CameraUpdateFactory.zoomTo(15));
    }

}
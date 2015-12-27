package es.jotamontero.dondeestamicoche;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LocalizacionActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacion);
        // Obtiene el SupportMapFragment y notifica cuando el mapa está listo para ser usado.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Aquí podemos manipular el mapa una vez esté disponible.
     * La API de maps llama automáticamente a este método una vez se haya cargado correctamente el map.
     * Aquí podemos añadir marcadores, lineas, listeners o mover la cámara.
     * Por defecto pondré el marcador cerca de mi ubicación en Cádiz.
     * Para que el mapa funcione correctamente el usuario tiene que tener instalado en su terminal los servicios de Google Play.
     * Si no los tiene, se abrirá Google Play instando al usuario a instalarlo.
     *
     * @param googleMap
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Añadimos un marcador en Cádiz y movemos la cámara.
        // Estos datos de latitud y longitud tendremos que obtenerlos en un hilo inferior para utilizar las coordenadas almacenadas previamente.
        LatLng sydney = new LatLng(36.46653,-5.93011);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Por aquí está mi cueva."));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}

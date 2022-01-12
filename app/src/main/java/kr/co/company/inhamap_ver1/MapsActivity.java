package kr.co.company.inhamap_ver1;

import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    // 강의실 건물 호관 위치 설정
    private static final LatLng inha = new LatLng(37.44816058024537, 126.6574504537891);    //인하공업전문대학
    private static final LatLng s = new LatLng(37.44805817573098, 126.65701371046615);    //본관 위치
    private static final LatLng s1 = new LatLng(37.44747897157174, 126.65800880997332);  //1호관
    private static final LatLng s2 = new LatLng(37.4476642322134, 126.65855866280076);   //2호관
    private static final LatLng s3 = new LatLng(37.44783458642151, 126.65822875110429);  //3호관
    private static final LatLng s4 = new LatLng(37.44808922857182, 126.6580059022702);   //4호관
    private static final LatLng s5 = new LatLng(37.448407399601145, 126.6571773252099);   //5호관
    private static final LatLng s6 = new LatLng(37.44887373870859, 126.65773254246864);   //6호관
    private static final LatLng s7 = new LatLng(37.449096259916764, 126.65719637569171);   //7호관
    private static final LatLng s8 = new LatLng(37.45007372499392, 126.6586785275257);   //8호관
    private static final LatLng s9 = new LatLng(37.45014289956978, 126.6578311947701);   //9호관
    private static final LatLng s10 = new LatLng(37.44823711421483, 126.65843964822575);  //10호관
    private static final LatLng s11 = new LatLng(37.4469655262947, 126.65796965799856);    //11호관

    // 지도 마커 선언
    private Marker ms;
    private Marker ms1;
    private Marker ms2;
    private Marker ms3;
    private Marker ms4;
    private Marker ms5;
    private Marker ms6;
    private Marker ms7;
    private Marker ms8;
    private Marker ms9;
    private Marker ms10;
    private Marker ms11;
    private Marker mkInha;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {   // 지도가 준비되면 호출됨
        mMap = googleMap;

        ms = mMap.addMarker(new MarkerOptions().position(s).title("본관").icon(BitmapDescriptorFactory.fromResource(R.drawable.img_s)));
        ms.setTag(0);

        ms1 = mMap.addMarker(new MarkerOptions().position(s1).title("1호관").snippet("<서비스학부>").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        ms1.setTag(0);

        ms2 = mMap.addMarker(new MarkerOptions().position(s2).title("2호관").snippet("<디자인학부>").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
        ms2.setTag(0);

        ms3 = mMap.addMarker(new MarkerOptions().position(s3).title("3호관").snippet("식당, 11:30~1:00").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        ms3.setTag(0);

        ms4 = mMap.addMarker(new MarkerOptions().position(s4).title("4호관").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        ms4.setTag(0);

        ms5 = mMap.addMarker(new MarkerOptions().position(s5).title("5호관").snippet("기계, 조선해양, 전기정보, 항공지리").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        ms5.setTag(0);

        ms6 = mMap.addMarker(new MarkerOptions().position(s6).title("6호관").snippet("<신소재공학부>").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));
        ms6.setTag(0);

        ms7 = mMap.addMarker(new MarkerOptions().position(s7).title("7호관").snippet("<정보산업공학부>, 도서관 9:00~20:00").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        ms7.setTag(0);

        ms8 = mMap.addMarker(new MarkerOptions().position(s8).title("8호관").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        ms8.setTag(0);

        ms9 = mMap.addMarker(new MarkerOptions().position(s9).title("9호관").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        ms9.setTag(0);

        ms10 = mMap.addMarker(new MarkerOptions().position(s10).title("10호관").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));
        ms10.setTag(0);

        ms11 = mMap.addMarker(new MarkerOptions().position(s11).title("11호관").snippet("<종합실습관>"));
        ms11.setTag(0);

        mkInha = mMap.addMarker(new MarkerOptions().position(inha).title("인하공업전문대학"));
        mkInha.setTag(0);

        mMap.moveCamera(CameraUpdateFactory.newLatLng(inha));  // 지도의 처음 위치 설정
    }

    /**마커 클릭하면 호출*/
    public boolean onMarkerClick(final Marker marker){
        Integer clickCount = (Integer) marker.getTag();

        if(clickCount != null){
            clickCount = clickCount + 1;
            marker.setTag(clickCount);
            Toast.makeText(this, marker.getTitle() + "가 클릭되었음, 클릭횟수 : " + clickCount, Toast.LENGTH_SHORT).show();
        }

        return false;
    }
}

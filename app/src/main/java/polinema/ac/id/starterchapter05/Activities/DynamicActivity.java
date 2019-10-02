package polinema.ac.id.starterchapter05.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.Fragment.Dip;
import polinema.ac.id.starterchapter05.Fragment.HandStand;
import polinema.ac.id.starterchapter05.Fragment.PushUp;
import polinema.ac.id.starterchapter05.R;

public class DynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic2);
    }

    public void handlerClickLoadPushUp(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        PushUp fragmentpushup = (PushUp) getSupportFragmentManager().findFragmentByTag("PUSH UP");

        if(fragmentpushup != null && fragmentpushup.isVisible()){
            //kosong
        }

        else{
            // Menambah efek animasi
            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

            // Menambah efek custom
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);

            // Menentukan fragment yang akan dituju
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new PushUp(), "PUSH UP");

            // Untuk bisa kembali ke fragment sebelumnya
            fragmentTransaction.addToBackStack(null);

            // Menjalankan fragment
            fragmentTransaction.commit();

        }




//        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new PushUp());
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
    }

    public void handlerClickLoadDip(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        Dip fragmentdip = (Dip) getSupportFragmentManager().findFragmentByTag("DIPS");

        if(fragmentdip != null && fragmentdip.isVisible()){
            //kosong
        }

        else{
            // Menambah efek animasi
            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

            // Menambah efek custom
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);


            // Menentukan fragment yang akan dituju
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new Dip(), "DIPS");

            // Untuk bisa kembali ke fragment sebelumnya
            fragmentTransaction.addToBackStack(null);

            // Menjalankan fragment
            fragmentTransaction.commit();

        }

//        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new Dip());
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
    }

    public void handlerClickLoadSitup(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();


        HandStand fragmenthandstand = (HandStand) getSupportFragmentManager().findFragmentByTag("HAND STAND");

        if(fragmenthandstand != null && fragmenthandstand.isVisible()){
            //kosong
        }

        else{
            // Menambah efek animasi
            // fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

            // Menambah efek custom
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);


            // Menentukan fragment yang akan dituju
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new HandStand(), "HAND STAND");

            // Untuk bisa kembali ke fragment sebelumnya
            fragmentTransaction.addToBackStack(null);

            // Menjalankan fragment
            fragmentTransaction.commit();

        }



//        fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
//        fragmentTransaction.replace(R.id.dynamic_fragment_placeholder,new HandStand());
//        fragmentTransaction.addToBackStack(null);
//        fragmentTransaction.commit();
    }
}

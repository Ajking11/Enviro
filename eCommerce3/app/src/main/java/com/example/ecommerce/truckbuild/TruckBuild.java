package com.example.ecommerce.truckbuild;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.ecommerce.HomeActivity;
import com.example.ecommerce.MainActivity;
import com.example.ecommerce.Model.Users;
import com.example.ecommerce.Prevalent.Prevalent;
import com.example.ecommerce.R;
import com.example.ecommerce.SettingsActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import io.paperdb.Paper;

public class TruckBuild extends AppCompatActivity {

    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    private NavigationView nav_view;
    private ProgressBar progressBar;
    private Button btnTruckSafety, btnTruckBatching, btnMaintenance, btnCalibration;
    String vinId = Prevalent.getVinId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_truck_build);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.truck_build_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        Menu navMenu = navigationView.getMenu();

        MenuItem truckBuildItem = navMenu.findItem(R.id.truck_build);
        MenuItem truckBatchingItem = navMenu.findItem(R.id.Truck_batching);
        MenuItem truckMaintenanceItem = navMenu.findItem(R.id.Truck_Maintenance);
        MenuItem truckCalibrationItem = navMenu.findItem(R.id.Truck_Calibration);

        if (vinId !=null)
        {
            // User has a vinId, show the menu items
            truckBuildItem.setVisible(true);
            truckBatchingItem.setVisible(true);
            truckMaintenanceItem.setVisible(true);
            truckCalibrationItem.setVisible(true);
        } else {
            // User doesn't have a vinId, hide the menu items
            truckBuildItem.setVisible(false);
            truckBatchingItem.setVisible(false);
            truckMaintenanceItem.setVisible(false);
            truckCalibrationItem.setVisible(false);
        }

        View headerView = navigationView.getHeaderView(0);
        TextView userNameTextView = headerView.findViewById(R.id.user_Profile_Name);
        CircleImageView profileImageView = headerView.findViewById(R.id.user_profile_image);

        userNameTextView.setText(Prevalent.currentOnlineUser.getName());
        Picasso.get().load(Prevalent.currentOnlineUser.getImage()).placeholder(R.drawable.profile).into(profileImageView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation view item clicks here.
                int id = item.getItemId();

                if (id == R.id.nav_home) {
                    Intent intent = new Intent(TruckBuild.this, HomeActivity.class);
                    startActivity(intent);
                } else if (id == R.id.nav_settings) {
                    Intent intent = new Intent(TruckBuild.this, SettingsActivity.class);
                    startActivity(intent);
                } else if (id == R.id.nav_Logout) {
                    Paper.book().destroy();
                    Intent intent = new Intent(TruckBuild.this, MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    finish();
                } else if (id == R.id.truck_build) {
                    if (hasVinId()) {
                        Intent intent = new Intent(TruckBuild.this, TruckBuild.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(TruckBuild.this, "Contact Admin", Toast.LENGTH_SHORT).show();}

                } else if (id == R.id.Truck_batching) {
                    Intent intent = new Intent(TruckBuild.this, TruckbatchingActivity.class);
                    startActivity(intent);
                } else if (id == R.id.Truck_Maintenance) {
                    Intent intent = new Intent(TruckBuild.this, MaintenanceActivity.class);
                    startActivity(intent);
                } else if (id == R.id.Truck_Calibration) {
                    Intent intent = new Intent(TruckBuild.this, CalibrationActivity.class);
                    startActivity(intent);
                }

                DrawerLayout drawer = findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }

        });

        progressBar = findViewById(R.id.progressBar_truck_build);
        btnTruckSafety = findViewById(R.id.btnTruckSaftey);
        btnTruckBatching = findViewById(R.id.btnTruckBatching);
        btnMaintenance = findViewById(R.id.btnMaintenance);
        btnCalibration = findViewById(R.id.btnCalibration);

        btnTruckSafety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle Truck Safety button click
            }
        });

        btnTruckBatching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TruckBuild.this, TruckbatchingActivity.class);
                startActivity(intent);
            }
        });

        btnMaintenance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TruckBuild.this, MaintenanceActivity.class);
                startActivity(intent);
            }
        });

        btnCalibration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TruckBuild.this, CalibrationActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private boolean hasVinId() {
        // Check if the current online user has a VIN ID
        return Prevalent.currentOnlineUser != null && Prevalent.currentOnlineUser.getVinId() != null;
    }
}
//    private void navigateToActivity(Class<?> destinationActivity) {
//        // Check if the user has a VIN ID
//        if (hasVinId()) {
//            Intent intent = new Intent(this, destinationActivity);
//            startActivity(intent);
//        } else {
//            // Handle the case where the user doesn't have a VIN ID
//            // For example, show a message or redirect to a page where VIN ID can be set
//            Toast.makeText(this, "VIN ID is required. Please set your VIN ID.", Toast.LENGTH_SHORT).show();
//
//            // Optionally, you can redirect to a page where the user can set their VIN ID
//            Intent intent = new Intent(this, SetVinIdActivity.class);
//            startActivity(intent);
//        }
//    }
//


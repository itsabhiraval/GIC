package com.example.october7sveryown.gic;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class HomeScreenActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    CoordinatorLayout coordinatorLayout;
    Context context ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        coordinatorLayout=(CoordinatorLayout)findViewById(R.id.mycoordinatorlayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View headerView = navigationView.getHeaderView(0);
        HomeFragment homeFragment=new HomeFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, homeFragment);
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Home");
         DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_login) {
            Intent  i = new Intent(HomeScreenActivity.this,LoginActivity.class);
            startActivity(i);
            Toast.makeText(HomeScreenActivity.this,"Successfully Logged out !!",Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {
            HomeFragment homeFragment=new HomeFragment();
            android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container,homeFragment);

            ft.commit();
            getSupportActionBar().setTitle("Home");

        } else if (id == R.id.profile) {
            ProfileFragment profileFragment=new ProfileFragment();
            android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container,profileFragment);
            ft.commit();
            getSupportActionBar().setTitle("Your Profile");

        } else if (id == R.id.wishlist) {
            WishlistFragment wishlistFragment=new WishlistFragment();
            android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container,wishlistFragment);
            ft.commit();
            getSupportActionBar().setTitle("Wishlists");
        } else if (id == R.id.Signout) {

           AlertDialog.Builder builder1 = new AlertDialog.Builder(HomeScreenActivity.this,R.style.AppCompatAlertDialogStyle);
            builder1.setTitle("Sign Out");
            builder1.setMessage("Do you want to Signout?");
            builder1.setCancelable(false);

            builder1.setPositiveButton(
                    "Yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            Intent intent = new Intent(HomeScreenActivity.this, LoginActivity.class);
                            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            Toast.makeText(HomeScreenActivity.this,"You are succesfully signed out !!",Toast.LENGTH_LONG).show();


                        }
                    });

            builder1.setNegativeButton(
                    "No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();

         /*   Button neg = alert11 .getButton(DialogInterface.);
            neg.setTextColor(Color.BLACK);

            Button pos = alert11 .getButton(DialogInterface.BUTTON_POSITIVE);
            pos.setTextColor(Color.BLACK);
*/

        } else if (id == R.id.aboutdev) {
            AboutDevelopersFragment aboutDevFragment=new AboutDevelopersFragment();
            android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container,aboutDevFragment);
            ft.commit();
            getSupportActionBar().setTitle("About Develpoers");
        }
        else if (id == R.id.aboutgic) {
            AboutGICFragment GICFragment = new AboutGICFragment();
            android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_container, GICFragment);
            ft.commit();
            getSupportActionBar().setTitle("About GIC");
        }
         else if (id == R.id.share) {

                String  PACKAGE_NAME = getApplicationContext().getPackageName();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Download GTU Innovation Council's official app from : https://play.google.com/store/apps/details?id=" + PACKAGE_NAME);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}



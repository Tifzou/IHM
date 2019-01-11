package insa.ihm;

import android.app.Fragment;
import android.os.Bundle;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class NavigationDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Fragment fragmentIHM;
    private Fragment fragmentAgile;
    private Fragment fragmentWS;

    private static final int FRAGMENT_IHM = 0;
    private static final int FRAGMENT_AGILE = 1;
    private static final int FRAGMENT_WS = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("OKK");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);


/*        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);*/
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
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        DrawerLayout layout = (DrawerLayout) findViewById(R.id.main_layout);
        if (id == R.id.nav_ihm) {
            getFragmentManager().beginTransaction().replace(layout.getId(), new Dashboard(), "").commit();
        } else if (id == R.id.nav_agile) {
            getFragmentManager().beginTransaction().replace(layout.getId(), new Dashboard(), "").commit();
        } else if (id == R.id.nav_ws) {
            getFragmentManager().beginTransaction().replace(layout.getId(), new Dashboard(), "").commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void showFragment(int fragmentIdentifier){
        switch (fragmentIdentifier){
            case FRAGMENT_IHM :
                this.showNewsFragment();
                break;
            case FRAGMENT_AGILE:
                this.showProfileFragment();
                break;
            case FRAGMENT_WS:
                this.showParamsFragment();
                break;
            default:
                break;
        }
    }

    // ---

    // 4 - Create each fragment page and show it

    private void showNewsFragment(){
//        if (this.fragmentAgile == null) this.fragmentAgile = TOREPLACE.newInstance();
        this.startTransactionFragment(this.fragmentAgile);
    }

    private void showParamsFragment(){
//        if (this.fragmentIHM == null) this.fragmentIHM = TOREPLACE.newInstance();
        this.startTransactionFragment(this.fragmentIHM);
    }

    private void showProfileFragment(){
//        if (this.fragmentWS == null) this.fragmentWS = TOREPLACE.newInstance();
        this.startTransactionFragment(this.fragmentWS);
    }

    // ---

    // 3 - Generic method that will replace and show a fragment inside the MainActivity Frame Layout
    private void startTransactionFragment(Fragment fragment){
        if (!fragment.isVisible()){/*
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.activity_main_frame_layout, fragment).commit();*/
        }
    }

}

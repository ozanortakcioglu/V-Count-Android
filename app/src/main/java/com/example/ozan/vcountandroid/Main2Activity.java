package com.example.ozan.vcountandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import com.example.ozan.vcountandroid.Fragments.Ble_Devices;
import com.example.ozan.vcountandroid.Fragments.Campaign_List;
import com.example.ozan.vcountandroid.Fragments.Campaign_Statistics;
import com.example.ozan.vcountandroid.Fragments.Categories;
import com.example.ozan.vcountandroid.Fragments.Categories_Options;
import com.example.ozan.vcountandroid.Fragments.Dashboard;
import com.example.ozan.vcountandroid.Fragments.Demographic;
import com.example.ozan.vcountandroid.Fragments.Demography_Devices;
import com.example.ozan.vcountandroid.Fragments.Devices;
import com.example.ozan.vcountandroid.Fragments.Doors;
import com.example.ozan.vcountandroid.Fragments.General_Insight;
import com.example.ozan.vcountandroid.Fragments.Group_Analysis;
import com.example.ozan.vcountandroid.Fragments.Groups;
import com.example.ozan.vcountandroid.Fragments.Heatmap_Analysis;
import com.example.ozan.vcountandroid.Fragments.Hourly_visitor_Statistics;
import com.example.ozan.vcountandroid.Fragments.Import_Goals;
import com.example.ozan.vcountandroid.Fragments.Mag_Demo;
import com.example.ozan.vcountandroid.Fragments.Multicamera_Heatmap;
import com.example.ozan.vcountandroid.Fragments.Multicamera_Heatmap_Options;
import com.example.ozan.vcountandroid.Fragments.Online_Health_Check;
import com.example.ozan.vcountandroid.Fragments.Performance_Analysis;
import com.example.ozan.vcountandroid.Fragments.Periodic_Reports;
import com.example.ozan.vcountandroid.Fragments.Profile;
import com.example.ozan.vcountandroid.Fragments.QueueV1;
import com.example.ozan.vcountandroid.Fragments.QueueV2;
import com.example.ozan.vcountandroid.Fragments.Queue_PN_Settings;
import com.example.ozan.vcountandroid.Fragments.Report_Templates;
import com.example.ozan.vcountandroid.Fragments.Reports;
import com.example.ozan.vcountandroid.Fragments.Sales_Integration;
import com.example.ozan.vcountandroid.Fragments.Satellites;
import com.example.ozan.vcountandroid.Fragments.Staff_MAC_IDs;
import com.example.ozan.vcountandroid.Fragments.Staff_Shifts;
import com.example.ozan.vcountandroid.Fragments.Store;
import com.example.ozan.vcountandroid.Fragments.Store_Info;
import com.example.ozan.vcountandroid.Fragments.Store_Level;
import com.example.ozan.vcountandroid.Fragments.Store_Optimizer;
import com.example.ozan.vcountandroid.Fragments.Visitor_Analysis;
import com.example.ozan.vcountandroid.Fragments.Whats_News;
import com.example.ozan.vcountandroid.Fragments.Wifi_Analysis;
import com.example.ozan.vcountandroid.Fragments.Wifi_Heatmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawer;
    Dashboard dashboard;
    General_Insight general_ınsight;
    Store_Level store_level;
    Store_Optimizer store_optimizer;
    Reports reports;
    Campaign_Statistics campaign_statistics;
    Campaign_List campaign_list;
    Periodic_Reports periodic_reports;
    Group_Analysis group_analysis;
    Hourly_visitor_Statistics hourly_visitor_statistics;
    Performance_Analysis performance_analysis;
    Mag_Demo mag_demo;
    QueueV1 queueV1;
    Heatmap_Analysis heatmap_analysis;
    Wifi_Analysis wifi_analysis;
    Categories categories;
    Demographic demographic;
    Visitor_Analysis visitor_analysis;
    Report_Templates report_templates;
    Devices devices;
    Satellites satellites;
    Demography_Devices demography_devices;
    Ble_Devices ble_devices;
    Doors doors;
    Store store;
    Multicamera_Heatmap multicamera_heatmap;
    QueueV2 queueV2;
    Wifi_Heatmap wifi_heatmap;
    Sales_Integration sales_integration;
    Groups groups;
    Staff_Shifts staff_shifts;
    Store_Info store_info;
    Import_Goals import_goals;
    Staff_MAC_IDs staff_mac_iDs;
    Categories_Options categories_options;
    Queue_PN_Settings queue_pn_settings;
    Multicamera_Heatmap_Options multicamera_heatmap_options;
    Profile profile;
    Online_Health_Check online_health_check;
    Whats_News whats_news;

    ExpandableListAdapter expandableListAdapter;
    ExpandableListView expandableListView;
    List<Integer> headerIcon = new ArrayList<>();
    HashMap<MenuModel,List<Integer>> childIcon = new HashMap<>();
    List<MenuModel> headerList = new ArrayList<>();
    HashMap<MenuModel, List<MenuModel>> childList = new HashMap<>();
    List<android.support.v4.app.Fragment> headerFragment =new ArrayList<>();
    HashMap<MenuModel,List<android.support.v4.app.Fragment>> childFragment =new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        profile = new Profile();
        online_health_check = new Online_Health_Check();
        whats_news = new Whats_News();
        sales_integration = new Sales_Integration();
        groups = new Groups();
        staff_shifts = new Staff_Shifts();
        store_info = new Store_Info();
        import_goals = new Import_Goals();
        staff_mac_iDs = new Staff_MAC_IDs();
        categories_options = new Categories_Options();
        queue_pn_settings = new Queue_PN_Settings();
        multicamera_heatmap_options = new Multicamera_Heatmap_Options();
        satellites = new Satellites();
        demography_devices = new Demography_Devices();
        ble_devices = new Ble_Devices();
        doors = new Doors();
        store = new Store();
        multicamera_heatmap = new Multicamera_Heatmap();
        queueV2 = new QueueV2();
        wifi_heatmap = new Wifi_Heatmap();
        dashboard = new Dashboard();
        devices = new Devices();
        general_ınsight = new General_Insight();
        store_level = new Store_Level();
        store_optimizer = new Store_Optimizer();
        reports = new Reports();
        campaign_statistics = new Campaign_Statistics();
        campaign_list = new Campaign_List();
        periodic_reports =new Periodic_Reports();
        group_analysis = new Group_Analysis();
        hourly_visitor_statistics = new Hourly_visitor_Statistics();
        performance_analysis = new Performance_Analysis();
        mag_demo = new Mag_Demo();
        queueV1 = new QueueV1();
        heatmap_analysis = new Heatmap_Analysis();
        wifi_analysis = new Wifi_Analysis();
        categories = new Categories();
        demographic = new Demographic();
        visitor_analysis = new Visitor_Analysis();
        report_templates = new Report_Templates();



        expandableListView = findViewById(R.id.expandableListView);
        prepareMenuData();
        populateExpandableList();

        setFragment(dashboard);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.profile){
            setFragment(profile);
        }
        else if(item.getItemId()==R.id.Online_Health_check){
            setFragment(online_health_check);
        }
        else if(item.getItemId()==R.id.Whats_News){
            setFragment(whats_news);
        }
        else if(item.getItemId()==R.id.api){

        }
        else if(item.getItemId()==R.id.logout){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }

        return true;
    }


    private void setFragment(android.support.v4.app.Fragment fragment){

        android.support.v4.app.FragmentTransaction fragmentTransaction
                = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.maimframe,fragment);
        fragmentTransaction.commit();

    }


    @Override
    public void onBackPressed() {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {


        /*
        if (id == R.id.nav_dash) {
            setFragment(dash);
        }else if (id == R.id.nav_gi) {
            setFragment(gi);
        }else if (id == R.id.nav_sl) {
            setFragment(sl);
        }else if (id == R.id.nav_campS) {
            setFragment(cs);
        }else if (id == R.id.nav_campL) {
            setFragment(cl);
        }else if (id == R.id.nav_rep) {
            setFragment(rep);
        }else if (id == R.id.nav_so) {
            setFragment(so);
        }else if (id == R.id.nav_opt) {
            setFragment(opt);
        }else if (id == R.id.nav_set) {
            setFragment(set);
        }
        */

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void prepareMenuData() {

        MenuModel menuModel = new MenuModel("Dashboard", true, false);
        headerList.add(menuModel);
        headerFragment.add(dashboard);
        headerIcon.add(R.drawable.dashboard);


        if (!menuModel.hasChildren) {
            childList.put(menuModel, null);
        }

        menuModel = new MenuModel("General Level", true, true);
        headerList.add(menuModel);
        headerFragment.add(general_ınsight);
        headerIcon.add(R.drawable.general);

        List<Integer> childIconList =new ArrayList<>();
        List<MenuModel> childModelsList = new ArrayList<>();
        List<android.support.v4.app.Fragment> childFragmentList = new ArrayList<>();
        MenuModel childModel = new MenuModel("General Insight", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(general_ınsight);
        childIconList.add(R.drawable.general_insight);

        childModel = new MenuModel("Performance Analysis", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(performance_analysis);
        childIconList.add(R.drawable.performance);

        childModel = new MenuModel("Hourly Visitor Statistics", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(hourly_visitor_statistics);
        childIconList.add(R.drawable.hourly_statistics);


        childModel = new MenuModel("Group Analysis", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(group_analysis);
        childIconList.add(R.drawable.store_groups);


        if (menuModel.hasChildren) {
            Log.d("API123","here");
            childList.put(menuModel, childModelsList);
            childFragment.put(menuModel,childFragmentList);
            childIcon.put(menuModel,childIconList);
        }


        menuModel = new MenuModel("Store Level", true, true);
        headerList.add(menuModel);
        headerFragment.add(store_level);
        headerIcon.add(R.drawable.store);

        childIconList = new ArrayList<>();
        childFragmentList = new ArrayList<>();
        childModelsList = new ArrayList<>();
        childModel = new MenuModel("Store Info", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(store_level);
        childIconList.add(R.drawable.information);


        childModel = new MenuModel("Visitor Analysis", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(visitor_analysis);
        childIconList.add(R.drawable.visitor_analytics);

        childModel = new MenuModel("Heatmap Analysis", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(heatmap_analysis);
        childIconList.add(R.drawable.heatmap);

        childModel = new MenuModel("Wifi Analysis", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(wifi_analysis);
        childIconList.add(R.drawable.wifi);

        childModel = new MenuModel("Queue", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(queueV1);
        childIconList.add(R.drawable.queue);

        childModel = new MenuModel("Categories", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(categories);
        childIconList.add(R.drawable.categories);

        childModel = new MenuModel("Demographic", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(demographic);
        childIconList.add(R.drawable.gender);

        childModel = new MenuModel("Mag Demo", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(mag_demo);
        childIconList.add(R.drawable.information);

        if (menuModel.hasChildren) {
            childList.put(menuModel, childModelsList);
            childFragment.put(menuModel,childFragmentList);
            childIcon.put(menuModel,childIconList);
        }

        menuModel = new MenuModel("Store Optimizer", true, false);
        headerList.add(menuModel);
        headerFragment.add(store_optimizer);
        headerIcon.add(R.drawable.customer_staff);

        if (!menuModel.hasChildren) {
            childList.put(menuModel, null);
        }

        menuModel = new MenuModel("Campaigns", true, true);
        headerList.add(menuModel);
        headerFragment.add(campaign_statistics);
        headerIcon.add(R.drawable.campaign);

        childIconList = new ArrayList<>();
        childModelsList = new ArrayList<>();
        childFragmentList = new ArrayList<>();
        childModel = new MenuModel("Campaigns Statistics", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(campaign_statistics);
        childIconList.add(R.drawable.campaign);


        childModel = new MenuModel("Campaign List", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(campaign_list);
        childIconList.add(R.drawable.campaign);

        if (menuModel.hasChildren) {
            childList.put(menuModel, childModelsList);
            childFragment.put(menuModel,childFragmentList);
            childIcon.put(menuModel,childIconList);
        }

        menuModel = new MenuModel("Reports", true, true);
        headerList.add(menuModel);
        headerFragment.add(report_templates);
        headerIcon.add(R.drawable.reports);

        childIconList = new ArrayList<>();
        childModelsList = new ArrayList<>();
        childFragmentList =new ArrayList<>();
        childModel = new MenuModel("Reports Templates", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(report_templates);
        childIconList.add(R.drawable.reports);


        childModel = new MenuModel("Periodic Reports", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(periodic_reports);
        childIconList.add(R.drawable.reports);


        if (menuModel.hasChildren) {
            childList.put(menuModel, childModelsList);
            childFragment.put(menuModel,childFragmentList);
            childIcon.put(menuModel,childIconList);

        }


        menuModel = new MenuModel("Options", true, true);
        headerList.add(menuModel);
        headerFragment.add(reports);
        headerIcon.add(R.drawable.options);

        childIconList = new ArrayList<>();
        childModelsList = new ArrayList<>();
        childFragmentList =new ArrayList<>();
        childModel = new MenuModel("Reports", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(reports);
        childIconList.add(R.drawable.reports);


        childModel = new MenuModel("Sales Integration", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(sales_integration);
        childIconList.add(R.drawable.sales_integration);


        childModel = new MenuModel("Groups", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(groups);
        childIconList.add(R.drawable.store_groups);


        childModel = new MenuModel("Store Info", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(store_info);
        childIconList.add(R.drawable.information);

        childModel = new MenuModel("Staff Shifts", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(staff_shifts);
        childIconList.add(R.drawable.staff);

        childModel = new MenuModel("Import Goals", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(import_goals);
        childIconList.add(R.drawable.goal);

        childModel = new MenuModel("Staff MAC IDs", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(staff_mac_iDs);
        childIconList.add(R.drawable.staffmac);

        childModel = new MenuModel("Categories", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(categories_options);
        childIconList.add(R.drawable.categories);

        childModel = new MenuModel("Queue PN Settings", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(queue_pn_settings);
        childIconList.add(R.drawable.queuesettings);

        childModel = new MenuModel("Multicamera Heatmap", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(multicamera_heatmap_options);
        childIconList.add(R.drawable.heatmap);

        if (menuModel.hasChildren) {
            childList.put(menuModel, childModelsList);
            childFragment.put(menuModel,childFragmentList);
            childIcon.put(menuModel,childIconList);
        }

        menuModel = new MenuModel("Settings", true, true);
        headerList.add(menuModel);
        headerFragment.add(devices);
        headerIcon.add(R.drawable.settings);

        childIconList = new ArrayList<>();
        childModelsList = new ArrayList<>();
        childFragmentList =new ArrayList<>();
        childModel = new MenuModel("Devices", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(devices);
        childIconList.add(R.drawable.devices);

        childModel = new MenuModel("Satellites", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(satellites);
        childIconList.add(R.drawable.wifi);

        childModel = new MenuModel("Demography Devices", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(demography_devices);
        childIconList.add(R.drawable.gender);

        childModel = new MenuModel("Ble Devices", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(ble_devices);
        childIconList.add(R.drawable.ble);

        childModel = new MenuModel("Doors", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(doors);
        childIconList.add(R.drawable.doors);

        childModel = new MenuModel("Store", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(store);
        childIconList.add(R.drawable.store);

        childModel = new MenuModel("Multicamera Heatmap", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(multicamera_heatmap);
        childIconList.add(R.drawable.heatmap);

        childModel = new MenuModel("Queue", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(queueV2);
        childIconList.add(R.drawable.queue);

        childModel = new MenuModel("Wifi Heatmap", false, false);
        childModelsList.add(childModel);
        childFragmentList.add(wifi_heatmap);
        childIconList.add(R.drawable.pathmap);

        if (menuModel.hasChildren) {
            childList.put(menuModel, childModelsList);
            childFragment.put(menuModel,childFragmentList);
            childIcon.put(menuModel,childIconList);
        }

    }
    private void populateExpandableList() {

        expandableListAdapter = new ExpandableListAdapter(this, headerList, childList, headerIcon, childIcon);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {

                if (headerList.get(groupPosition).isGroup) {
                    if (!headerList.get(groupPosition).hasChildren) {
                        setFragment(headerFragment.get(groupPosition));
                        onBackPressed();

                    }
                    else if(headerList.get(groupPosition).hasChildren){
                        setFragment(childFragment.get(headerList.get(groupPosition)).get(0));
                    }
                }

                return false;
            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                if (childList.get(headerList.get(groupPosition)) != null) {
                    setFragment(childFragment.get(headerList.get(groupPosition)).get(childPosition));
                    onBackPressed();
                }

                return false;
            }
        });

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            int previousGroup = -1;

            @Override
            public void onGroupExpand(int groupPosition) {
                if(groupPosition != previousGroup)
                    expandableListView.collapseGroup(previousGroup);
                previousGroup = groupPosition;
            }
        });
    }
}

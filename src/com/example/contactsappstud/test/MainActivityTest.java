package com.example.contactsappstud.test;

import android.content.Intent;
import android.widget.Button;
import android.widget.ListView;

import com.example.contactsappstud.MainActivity;

public class MainActivityTest extends android.test.ActivityUnitTestCase<MainActivity> {

	private MainActivity activity;
	private int buttonRefresh;
	private int listViewContacts;
	
	public MainActivityTest() {
		super(MainActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		Intent intent = new Intent(getInstrumentation().getTargetContext(),
		        MainActivity.class);
	    startActivity(intent, null, null);
	    activity = getActivity();
	}
	
	/**
	 * Test if the refresh button is correctly instantiate
	 */
	public void testLayout() {
		buttonRefresh = com.example.contactsappstud.R.id.buttonRefresh;
	    assertNotNull(activity.findViewById(buttonRefresh));
	    Button view = (Button) activity.findViewById(buttonRefresh);
	    assertEquals("Incorrect label of the button", "Refresh", view.getText());
	}
	
	/**
	 * Test if the refresh button & the list of contacts are not null
	 */
	public void testLoadingContacts() {
		buttonRefresh = com.example.contactsappstud.R.id.buttonRefresh;
	    assertNotNull(activity.findViewById(buttonRefresh));
	    Button view = (Button) activity.findViewById(buttonRefresh);
	    assertNotNull("Button not allowed to be null", view);
	    
	    listViewContacts = com.example.contactsappstud.R.id.listViewContacts;
	    assertNotNull(activity.findViewById(listViewContacts));
	    ListView listView = (ListView) activity.findViewById(listViewContacts);
	    assertNotNull("List of contacts not allowed to be null", listView);
	}
	
	/**
	 * Test if the number of contacts loaded in the list view is 10
	 */
	public void testCountContacts() {
		listViewContacts = com.example.contactsappstud.R.id.listViewContacts;
	    assertNotNull(activity.findViewById(listViewContacts));
	    ListView listView = (ListView) activity.findViewById(listViewContacts);
	    assertNotNull("List of contacts not allowed to be null", listView);
	    assertEquals("Incorrect number of contacts", 10, listView.getCount());
	}
}

package paginasweb.pe.ejercicio_submenu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static final int item01=1;
	private static final int item02=2;
	private static final int item03=3;
	private static final int item04=4;
	private static final int subitem01 = 1;
	private static final int subitem02 = 2;
	private static final int subitem03 = 3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.main, menu);
		menu.add(Menu.NONE, item01, 0, "Strar - Java").setIcon(android.R.drawable.btn_star);
		menu.add(Menu.NONE, item02, 1, "delete - Java").setIcon(android.R.drawable.ic_delete);
		menu.add(Menu.NONE, item03, 2, "alert - Java").setIcon(android.R.drawable.ic_dialog_alert);
		SubMenu sm= menu.addSubMenu(Menu.NONE, item04, 3, "dialog - Java").setIcon(android.R.drawable.btn_dialog);
		sm.add(Menu.NONE, subitem01, Menu.NONE, "Submenu 01 de item 04");
		sm.add(Menu.NONE, subitem02, Menu.NONE, "Submenu 02 de item 04");
		sm.add(Menu.NONE, subitem03, Menu.NONE, "Submenu 03 de item 04");
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case subitem01:
			Toast.makeText(getApplicationContext(), "Sub menu 01", Toast.LENGTH_SHORT).show();
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}

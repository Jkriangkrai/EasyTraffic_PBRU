package thailand.pbru.jarirapanya.kriagnkrai.easytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Exclicit คือการประกาศตัวแปร private ใช้ใน classs นี้เท่านั้น  public ใช้ได้ทุก class
    private ListView trafficListView;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial widget
        inititialWindget();

    } // Main Method

    private void inititialWindget() {
        trafficListView = (ListView) findViewById(R.id.listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    } //

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
} // Main Class

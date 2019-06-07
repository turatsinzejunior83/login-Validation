package manzi.ur.awesomenavmanzi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class restaurantActivity extends AppCompatActivity {
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        listview= (ListView)findViewById(R.id.listview);

        ArrayList<String> words = new ArrayList<String>();
        words.add("MealType: Chicken");
        words.add("MealTime: 2Hours");
        words.add("Ingredients: Meat");


        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView) ;
        TextView wordview = new TextView(this);
        wordview.setText(words.get(0));
        rootView.addView(wordview);

        TextView wordview2 = new TextView(this);
        wordview2.setText(words.get(2));
        rootView.addView(wordview2);



        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,words);

        //ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
    }
}

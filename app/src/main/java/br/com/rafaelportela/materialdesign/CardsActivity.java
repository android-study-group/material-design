package br.com.rafaelportela.materialdesign;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class CardsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);

        ItemCard[] items = new ItemCard[] {
                new ItemCard(),
                new ItemCard(),
                new ItemCard(),
                new ItemCard(),
                new ItemCard()
        };

        ListView cardsList = (ListView) findViewById(R.id.cards_list);
        cardsList.setAdapter(new CardsAdapter(this, R.layout.item_card, items));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cards, menu);
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
}

class CardsAdapter extends ArrayAdapter<ItemCard> {
    public CardsAdapter(Context context, int resource, ItemCard[] objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View card = LayoutInflater.from(getContext()).inflate(R.layout.item_card, parent, false);

        return card;
    }
}

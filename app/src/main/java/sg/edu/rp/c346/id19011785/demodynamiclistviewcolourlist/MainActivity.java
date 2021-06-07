package sg.edu.rp.c346.id19011785.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etElement, etIndexElement;
    Button btnAdd;

    ListView lvColours;
    ArrayList<String> alColours;
    ArrayAdapter<String> aaColour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement = findViewById(R.id.editTextColour);
        btnAdd = findViewById(R.id.btnAddColour);
        lvColours = findViewById(R.id.listViewColour);
        etIndexElement = findViewById(R.id.editTextIndex);

        alColours = new ArrayList<String>();
        alColours.add("Red");
        alColours.add("Orange");

        aaColour = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alColours);
        lvColours.setAdapter(aaColour);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newColour = etElement.getText().toString();
                //alColours.add(newColour);
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.add(pos, newColour);
                aaColour.notifyDataSetChanged();
            }
        });

    }
}
package com.example.admin.CD_Project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class SearchBook extends AppCompatActivity {

    private Spinner bookSpinner;
    private ArrayList<String> bookType = new ArrayList<String>();

    private  String typeName = "";
    private  String bookName = "";
    private  String authorName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_book);

        bookSpinner = (Spinner) findViewById(R.id.Dropdown);

        createThaiClubData();

        // Adapter ตัวแรก
        ArrayAdapter<String> adapterBook = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, bookType);
        bookSpinner.setAdapter(adapterBook);

        // setOnItemSelectedListener
        bookSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                /*Toast.makeText(SearchBook.this,
                        "Select : " + bookType.get(position),
                        Toast.LENGTH_SHORT).show();*/
                typeName = bookType.get(position).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button searchButton = findViewById(R.id.SearchButton_Search);
        Button back = findViewById(R.id.back_to_home);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //String bookAndAuthor = bookName+","+authorName;
                /*Toast t1 = Toast.makeText(SearchBook.this, typeName, Toast.LENGTH_SHORT);
                t1.show();*/


                if (typeName.equals("Action")||typeName.equals("Comedy")
                        ||typeName.equals("Romance")||typeName.equals("Adventure")
                        ||typeName.equals("Drama")||typeName.equals("Crime")
                        ||typeName.equals("Fantasy")||typeName.equals("Sci-Fi")
                        ||typeName.equals("Biography")||typeName.equals("Thriller")
                        ||typeName.equals("Animation")||typeName.equals("History")
                        ||typeName.equals("Family")){
                    Intent intent = new Intent(SearchBook.this, ResultBook.class);
                   
                    intent.putExtra("book", bookName);
                    intent.putExtra("author", authorName);
                    intent.putExtra("type", typeName);
                    startActivity(intent);
                }else{
                    Toast t = Toast.makeText(SearchBook.this, "กรุณาเลือกประเภทหนัง", Toast.LENGTH_SHORT);
                    t.show();
                }


                /*
                Intent intent = new Intent(SearchBook.this, SearchBook.class);

                startActivity(intent);*/
            }
        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void createThaiClubData() {
        bookType.add("เลือกประเภทของหนัง");
        bookType.add("Action");
        bookType.add("Comedy");
        bookType.add("Romance");
        bookType.add("Adventure");
        bookType.add("Drama");
        bookType.add("Crime");
        bookType.add("Fantasy");
        bookType.add("Sci-Fi");
        bookType.add("Biography");
        bookType.add("Thriller");
        bookType.add("Animation");
        bookType.add("History");
        bookType.add("Family");
 }

}

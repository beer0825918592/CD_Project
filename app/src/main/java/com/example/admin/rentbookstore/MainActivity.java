package com.example.admin.rentbookstore;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.admin.rentbookstore.adapter.BookListAdapter;
import com.example.admin.rentbookstore.db.DatabaseHelper;
import com.example.admin.rentbookstore.model.BookItem;

import static com.example.admin.rentbookstore.db.DatabaseHelper.TABLE_NAME;
import static com.example.admin.rentbookstore.db.DatabaseHelper.COL_NAMEBOOK;
import static com.example.admin.rentbookstore.db.DatabaseHelper.COL_NAMEAUTHOR;
import static com.example.admin.rentbookstore.db.DatabaseHelper.COL_NUMPAGE;
import static com.example.admin.rentbookstore.db.DatabaseHelper.COL_PRICEBOOK;
import static com.example.admin.rentbookstore.db.DatabaseHelper.COL_PRICERENT;
import static com.example.admin.rentbookstore.db.DatabaseHelper.COL_TYPEBOOK;
import static com.example.admin.rentbookstore.db.DatabaseHelper.COL_IMAGE;
import static com.example.admin.rentbookstore.db.DatabaseHelper.COL_STATUS;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DatabaseHelper mHelper;
    private SQLiteDatabase mDb;

    private List<BookItem> mBookItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHelper = new DatabaseHelper(MainActivity.this);
        mDb = mHelper.getWritableDatabase();


        Button goToSearch = findViewById(R.id.Search);
        goToSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchBook.class);
                startActivity(intent);
            }
        });

    }



    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        loadBookData();
        setupListView();
    }

    private void loadBookData() {
        Cursor c = mDb.query(TABLE_NAME, null, null, null, null, null, null);

        mBookItemList = new ArrayList<>();
        while (c.moveToNext()) {




                String namebook = c.getString(c.getColumnIndex(COL_NAMEBOOK));
                String nameauthor = c.getString(c.getColumnIndex(COL_NAMEAUTHOR));
                String numpage = c.getString(c.getColumnIndex(COL_NUMPAGE));
                String pricebook = c.getString(c.getColumnIndex(COL_PRICEBOOK));
                String pricerent = c.getString(c.getColumnIndex(COL_PRICERENT));
                String typebook = c.getString(c.getColumnIndex(COL_TYPEBOOK));
                String image = c.getString(c.getColumnIndex(COL_IMAGE));
                String status = c.getString(c.getColumnIndex(COL_STATUS));


                BookItem item = new BookItem(namebook, nameauthor, numpage, pricebook, pricerent, typebook, image, status);
                mBookItemList.add(item);


        }
        c.close();
    }

    private void setupListView() {
        /*ArrayAdapter<BookItem> adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                mBookItemList
        );*/

        BookListAdapter adapter = new BookListAdapter(
                MainActivity.this,
                R.layout.item_book,
                mBookItemList
        );

        ListView lv = findViewById(R.id.result_list_view2);
        lv.setAdapter(adapter);


        /*lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                PhoneItem item = mPhoneItemList.get(position);
                // _id ของ item ในลิสต์ที่ถูกแตะค้าง
                long id = item._id;

                // แก้ไขเบอร์โทรเป็น 9999999999
                ContentValues cv = new ContentValues();
                cv.put(COL_NUMBER, "9999999999");

                mDb.update(
                        TABLE_NAME,
                        cv,
                        COL_ID + " = ?", // เงื่อนไขของแถวใน table ที่จะแก้ไขข้อมูล ก็คือแถวที่สัมพันธ์กับ item ในลิสต์ที่ถูกแตะค้าง
                        new String[]{String.valueOf(id)}
                );

                loadPhoneData();
                setupListView();

                return true;
            }
        });*/


    }
}

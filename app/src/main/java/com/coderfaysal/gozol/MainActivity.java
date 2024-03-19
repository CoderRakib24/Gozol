package com.coderfaysal.gozol;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycleView);


        hashMap = new HashMap<>();
        hashMap.put("title", "লা ইলাহা ইল্লাল্লাহ গজল লিরিক্স");
        hashMap.put("message", "আল্লাহহু আল্লাহহু, আল্লহহু আল্লাহ,\n" +
                "আল্লাহহু আল্লাহহু, আল্লহহু আল্লাহ,\n" +
                "\n" +
                "লা ইলাহা ইল্লাল্লাহ, খালিক মালিক তুমি ইলা ৩\n" +
                "জীবন তরি ডুবু ডুবু, দয়া কর তুমি\n" +
                "কবুল কর বান্দা তোমার ওগো অন্তর জামি,\n" +
                "আমার গলে পড়াও তুমি প্রেমেরি মালা।\n" +
                "\n" +
                "লা ইলাহা ইল্লাল্লাহ, খালিক মালিক তুমি ইলা ২\n" +
                "মোহাম্মাদুর রাসুল আল্লাহ\n" +
                "\n" +
                "তোমারি নাম জফছে সদা, তামাম আলো।\n" +
                "ধরার বুখে ঝরছে সদা, তোমারি রহম\n" +
                "সারা জাহানে চলছে তোমার কুদরতি খেলা\n" +
                "লা ইলাহা ইল্লাল্লাহ, খালিক মালিক তুমি ইলা ২\n" +
                "মোহাম্মাদুর রাসুল আল্লাহ\n" +
                "\n" +
                "তুমি মাবুদ থাকলে রাজি\n" +
                "চাইনা ধন দৌলত\n" +
                "আমার ছখে দাও ভাসিয়ে তোমারি কুদরত\n" +
                "আমি শুধু খুজি তোমার দয়ার উসিলা\n" +
                "লা ইলাহা ইল্লাল্লাহ, খালিক মালিক তুমি ইলা ২\n" +
                "মোহাম্মাদুর রাসুল আল্লাহ\n" +
                "\n" +
                "পাপি তাপি কত বান্দায়, কর মাগফেরাত\n" +
                "আমায় ক্ষমা কর তুমি দাওগো হেদায়াত\n" +
                "গোলামিতে রেখ আমায় বেলা ওবেলা\n" +
                "লা ইলাহা ইল্লাল্লাহ, খালিক মালিক তুমি ইলা ২\n" +
                "\n" +
                "আল্লাহহু আল্লাহহু, আল্লহহু আল্লাহ,\n" +
                "আল্লাহহু আল্লাহহু, আল্লহহু আল্লাহ,\n" +
                "মোহাম্মাদুর রাসুল আল্লাহ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "বাবা তুমি কেমন আছো গজল লিরিক্স");
        hashMap.put("message", "বাবা তুমি কেমন আছো,\n" +
                "ছোট্ট মাটির ঘরে\n" +
                "তোমার কথা হৃদয় মাঝে,\n" +
                "পড়ছে বারে বারে-১\n" +
                "বাবা গো ও ও ও বাবা\n" +
                "বাবা গো ও ও ও বাবা-১\n" +
                "\n" +
                "কত আদর কত স্নেহ,\n" +
                "তোমার কাছে পেলাম\n" +
                "সব কিছু হারিয়ে আজকে\n" +
                "নিঃস্ব হয়ে গেলাম-১\n" +
                "ভালোবাসি তোমায় বাবা\n" +
                "বুকটা যে যায় ছিঁড়ে\n" +
                "তোমার কথা হৃদয় মাঝে\n" +
                "পড়ছে বারে বারে\n" +
                "বাবা গো ও ও ও বাবা\n" +
                "বাবা গো ও ও ও বাবা-১\n" +
                "\n" +
                "তোমার মত আপন কেহ\n" +
                "পাই না তো আর খুঁজে\n" +
                "তাইতো আজই ঘুমের ঘোরে\n" +
                "আশ্রুতে যাই ভিজে-১\n" +
                "সুখে থেকো পরম সুখে,\n" +
                "জান্নাতের ভিতরে\n" +
                "তোমার কথা হৃদয় মাঝে\n" +
                "পড়ছে বারে বারে\n" +
                "বাবা গো ও ও ও বাবা\n" +
                "বাবা গো ও ও ও বাবা");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ গজল লিরক্স");
        hashMap.put("message", "ইয়া রাসূলাল্লাহ, রাসূলাল্লাহ, রাসূলাল্লাহ\n" +
                "ইয়া হাবিবাল্লাহ, হাবিবাল্লাহ, হাবিবাল্লাহ\n" +
                "\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ-১\n" +
                "\n" +
                "আঁধার রাতে আলো নিয়ে,\n" +
                "কে এলে তুমি এই ধরাতে।\n" +
                "হিদায়েতের বানী নিয়ে,\n" +
                "ঘুরেছ তুমি দারে দারে।\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ\n" +
                "\n" +
                "তোমারি পরশে মাইয়ারি আবেশে,\n" +
                "পুন্য হলো আরব ভুমি।\n" +
                "নীখিল জাহান ধন্য হলো,\n" +
                "পেয়ে তোমার চরণ ধুলি-১\n" +
                "\n" +
                "তুমি আমার নবী ধ্যানের ছবি,\n" +
                "তোমার কাছে পেতে পাগল সবি।\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ\n" +
                "\n" +
                "কাফেরের আঘাতে, রক্ত ঝড়েছে\n" +
                "বদর ওহুদ ঐ তায়েপেতে।\n" +
                "তবুও তুমি কুরাআনের বাণী,\n" +
                "পৌছে দিয়েছো দ্বিলে দ্বিলে-১\n" +
                "\n" +
                "তুমি আমার নবী ধ্যানের ছবি,\n" +
                "তোমায় কাছে পেতে পাগল সবি।\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ\n" +
                "\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ\n" +
                "ইয়া রাসূলাল্লাহ ইয়া হাবিবাল্লাহ");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "সকালটা শুরু হোক প্রভুর নামে");
        hashMap.put("message", "সকালটা শুরু হোক প্রভুর নামে\n" +
                "বিকালটা শেষ হোক তারি স্বরণে-১\n" +
                "রাত হবে গুণ গুণ যিকিরে মুখোর,\n" +
                "সুবেহে সাদীকে জুকি চরণে।\n" +
                "\n" +
                "লা ইলাহা ইল্লাল্লাহ, লা ইলাহা ইল্লাল্লাহ\n" +
                "লা ইলাহা ইল্লাল্লাহ মুহাম্মাদ রাসুলউল্লাহ।\n" +
                "\n" +
                "কাজ গুলো সদা হোক বিধান মত\n" +
                "অসহায় মানুষের মুছবে ক্ষত-১\n" +
                "মন হবে দুখ দুখ ভয়েতে নরম\n" +
                "আজাবের কথা তব মনে পরিলে।\n" +
                "\n" +
                "লা ইলাহা ইল্লাল্লাহ, লা ইলাহা ইল্লাল্লাহ\n" +
                "লা ইলাহা ইল্লাল্লাহ মুহাম্মাদ রাসুলউল্লাহ।\n" +
                "\n" +
                "ঘৃণা ক্ষোভ ভালোবাসা রবের কারণ\n" +
                "তার হুকুমে সব হোক যে ধারণ-১\n" +
                "মুছে যাক হৃদয়ের সব কালিমান\n" +
                "পুণ্যে হয়ে যাক মন উজালা।\n" +
                "\n" +
                "লা ইলাহা ইল্লাল্লাহ, লা ইলাহা ইল্লাল্লাহ\n" +
                "লা ইলাহা ইল্লাল্লাহ মুহাম্মাদ রাসুলউল্লাহ।\n" +
                "\n" +
                "আখেরাত কাছা কাছি রাখো মনে\n" +
                "প্রস্তুতি নিয়ে থাকো প্রতি ক্ষণে-১\n" +
                "কবরেও বইয়ে যাবে নেক দরিয়া\n" +
                "সদকায়ে জারিয়া রেখে মরিলে।\n" +
                "\n" +
                "লা ইলাহা ইল্লাল্লাহ, লা ইলাহা ইল্লাল্লাহ\n" +
                "লা ইলাহা ইল্লাল্লাহ মুহাম্মাদ রাসুলউল্লাহ।");
        arrayList.add(hashMap);


        XAdapter xAdapter = new XAdapter();
        recyclerView.setAdapter(xAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }


    private class XAdapter extends RecyclerView.Adapter<XAdapter.XViewHolder>{


        @NonNull
        @Override
        public XViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.items, parent, false );
            return new XViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull XViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String title = hashMap.get("title");
            String message = hashMap.get("message");

            holder.textView.setText(title);

            holder.cardView.setOnClickListener(view -> {
                Details.TITLE = title;
                Details.MESSAGE = message;
                startActivity(new Intent(MainActivity.this, Details.class));
            });


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class XViewHolder extends RecyclerView.ViewHolder{

            TextView textView;
            CardView cardView;

            public XViewHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.textView);
                cardView = itemView.findViewById(R.id.cardView);
            }
        }

    }






}
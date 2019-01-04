package com.example.phamthaivuong.myapplication.FAQ;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.phamthaivuong.myapplication.Adapter.Adapter_FQA;
import com.example.phamthaivuong.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FQAActivity extends AppCompatActivity {
    private ExpandableListView listView_FQA;
    private Adapter_FQA adapter_fqa;
    private List<String> listData_title;
    private HashMap<String,List<String>> listData_content;
    ImageButton imgbtn;
    TextView tv;
    public static final String content_FQA_1 = "\"Sed up perspiciatis unde cmnis iste natus error sit voluptatem accusantiun doloremque laudatium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione.\" +\n" +
            "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed condimentum pharetra lacus eu mollis. In semper magna et ante ullamcorper, vitae egestas nulla congue. Nam non sapien id leo tempus consectetur nec elementum magna. Pellentesque ut nisl magna. Pellentesque tempus quam sit amet gravida eleifend. Mauris pellentesque laoreet nulla ac euismod. Praesent nisi eros, tincidunt non tincidunt pretium, euismod quis nibh. Nullam venenatis quam quis imperdiet aliquet. Pellentesque luctus mollis tellus sed tincidunt. Nullam congue, odio sed consequat vestibulum, elit dolor efficitur libero, et vestibulum nunc risus a massa.\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"Nullam facilisis lacus justo, eget semper sapien varius vel. Sed metus nibh, commodo vitae massa id, interdum dignissim ante. Donec vitae varius lorem, ac ullamcorper felis. Aenean hendrerit pretium mauris, nec elementum libero semper in.\" +\n" +
            "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed condimentum pharetra lacus eu mollis. In semper magna et ante ullamcorper, vitae egestas nulla congue. Nam non sapien id leo tempus consectetur nec elementum magna. Pellentesque ut nisl magna. Pellentesque tempus quam sit amet gravida eleifend. Mauris pellentesque laoreet nulla ac euismod. Praesent nisi eros, tincidunt non tincidunt pretium, euismod quis nibh. Nullam venenatis quam quis imperdiet aliquet. Pellentesque luctus mollis tellus sed tincidunt. Nullam congue, odio sed consequat vestibulum, elit dolor efficitur libero, et vestibulum nunc risus a massa.\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"Nullam facilisis lacus justo, eget semper sapien varius vel. Sed metus nibh, commodo vitae massa id, interdum dignissim ante. Donec vitae varius lorem, ac ullamcorper felis. Aenean hendrerit pretium mauris, nec elementum libero semper in.\")";
    public static final String title_FQA_1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit ?";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fqa);
        init();
        addEvent();
        listView_FQA = (ExpandableListView)findViewById(R.id.lvFQA);
        adapter_fqa = new Adapter_FQA(this,listData_title,listData_content);
        listView_FQA.setAdapter(adapter_fqa);
        adapter_fqa.setOnClickContent(new Adapter_FQA.OnClickContent() {
            @Override
            public void onclick(String content_FQA) {
                Intent intent = new Intent(FQAActivity.this,Detail_FQAActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("title",content_FQA);
                bundle.putString("content", content_FQA);
                intent.putExtra("dulieu",bundle);
                startActivity(intent);
            }
        });
    }

    private void addEvent() {
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @SuppressLint("ResourceAsColor")
    private void init() {

        imgbtn = (ImageButton)findViewById(R.id.imgbtn);
        listData_title = new ArrayList<>();
        listData_content = new HashMap<>();

        listData_title.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit ?");
        listData_title.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit sed do eiusmod ?");
        listData_title.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit sed do eiusmod temp ?");
        listData_title.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit ?");
        listData_title.add("Lorem ipsum dolor sit amet, consectetur adipiscing elit sed do eiusmod ?");

        List<String> txt_title_FQA = new ArrayList<>();
        txt_title_FQA.add("Sed up perspiciatis unde cmnis iste natus error sit voluptatem accusantiun doloremque laudatium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione." +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed condimentum pharetra lacus eu mollis. In semper magna et ante ullamcorper, vitae egestas nulla congue. Nam non sapien id leo tempus consectetur nec elementum magna. Pellentesque ut nisl magna. Pellentesque tempus quam sit amet gravida eleifend. Mauris pellentesque laoreet nulla ac euismod. Praesent nisi eros, tincidunt non tincidunt pretium, euismod quis nibh. Nullam venenatis quam quis imperdiet aliquet. Pellentesque luctus mollis tellus sed tincidunt. Nullam congue, odio sed consequat vestibulum, elit dolor efficitur libero, et vestibulum nunc risus a massa.\n" +
                "\n" +
                "Nullam facilisis lacus justo, eget semper sapien varius vel. Sed metus nibh, commodo vitae massa id, interdum dignissim ante. Donec vitae varius lorem, ac ullamcorper felis. Aenean hendrerit pretium mauris, nec elementum libero semper in." +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed condimentum pharetra lacus eu mollis. In semper magna et ante ullamcorper, vitae egestas nulla congue. Nam non sapien id leo tempus consectetur nec elementum magna. Pellentesque ut nisl magna. Pellentesque tempus quam sit amet gravida eleifend. Mauris pellentesque laoreet nulla ac euismod. Praesent nisi eros, tincidunt non tincidunt pretium, euismod quis nibh. Nullam venenatis quam quis imperdiet aliquet. Pellentesque luctus mollis tellus sed tincidunt. Nullam congue, odio sed consequat vestibulum, elit dolor efficitur libero, et vestibulum nunc risus a massa.\n" +
                "\n" +
                "Nullam facilisis lacus justo, eget semper sapien varius vel. Sed metus nibh, commodo vitae massa id, interdum dignissim ante. Donec vitae varius lorem, ac ullamcorper felis. Aenean hendrerit pretium mauris, nec elementum libero semper in.");

        List<String> txt_title_FQA_2 = new ArrayList<>();
        txt_title_FQA_2.add("Sed up perspiciatis unde cmnis iste natus error sit voluptatem accusantiun doloremque laudatium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione.");

        List<String> txt_title_FQA_3 = new ArrayList<>();
        txt_title_FQA_3.add("Sed up perspiciatis unde cmnis iste natus error sit voluptatem accusantiun doloremque laudatium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione.");

        List<String> txt_title_FQA_4 = new ArrayList<>();
        txt_title_FQA_4.add("Sed up perspiciatis unde cmnis iste natus error sit voluptatem accusantiun doloremque laudatium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione.");

        List<String> txt_title_FQA_5 = new ArrayList<>();
        txt_title_FQA_5.add("Sed up perspiciatis unde cmnis iste natus error sit voluptatem accusantiun doloremque laudatium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione.");


        listData_content.put(listData_title.get(0),txt_title_FQA);
        listData_content.put(listData_title.get(1),txt_title_FQA_2);
        listData_content.put(listData_title.get(2),txt_title_FQA_3);
        listData_content.put(listData_title.get(3),txt_title_FQA_4);
        listData_content.put(listData_title.get(4),txt_title_FQA_5);




    }

}

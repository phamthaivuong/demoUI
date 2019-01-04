package com.example.phamthaivuong.myapplication.Adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.phamthaivuong.myapplication.R;

import java.util.HashMap;
import java.util.List;

public class Adapter_FQA  extends BaseExpandableListAdapter {
    private Context context;
    private List<String> listdata_FQA;
    private HashMap<String,List<String>> listHashMap_FQA;
    private OnClickContent onClickContent;

    public static final String content_FQA_1 = "\"Sed up perspiciatis unde cmnis iste natus error sit voluptatem accusantiun doloremque laudatium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione.\" +\n" +
            "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed condimentum pharetra lacus eu mollis. In semper magna et ante ullamcorper, vitae egestas nulla congue. Nam non sapien id leo tempus consectetur nec elementum magna. Pellentesque ut nisl magna. Pellentesque tempus quam sit amet gravida eleifend. Mauris pellentesque laoreet nulla ac euismod. Praesent nisi eros, tincidunt non tincidunt pretium, euismod quis nibh. Nullam venenatis quam quis imperdiet aliquet. Pellentesque luctus mollis tellus sed tincidunt. Nullam congue, odio sed consequat vestibulum, elit dolor efficitur libero, et vestibulum nunc risus a massa.\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"Nullam facilisis lacus justo, eget semper sapien varius vel. Sed metus nibh, commodo vitae massa id, interdum dignissim ante. Donec vitae varius lorem, ac ullamcorper felis. Aenean hendrerit pretium mauris, nec elementum libero semper in.\" +\n" +
            "                \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed condimentum pharetra lacus eu mollis. In semper magna et ante ullamcorper, vitae egestas nulla congue. Nam non sapien id leo tempus consectetur nec elementum magna. Pellentesque ut nisl magna. Pellentesque tempus quam sit amet gravida eleifend. Mauris pellentesque laoreet nulla ac euismod. Praesent nisi eros, tincidunt non tincidunt pretium, euismod quis nibh. Nullam venenatis quam quis imperdiet aliquet. Pellentesque luctus mollis tellus sed tincidunt. Nullam congue, odio sed consequat vestibulum, elit dolor efficitur libero, et vestibulum nunc risus a massa.\\n\" +\n" +
            "                \"\\n\" +\n" +
            "                \"Nullam facilisis lacus justo, eget semper sapien varius vel. Sed metus nibh, commodo vitae massa id, interdum dignissim ante. Donec vitae varius lorem, ac ullamcorper felis. Aenean hendrerit pretium mauris, nec elementum libero semper in.\")";
    public static final String title_FQA_1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit ?";
    public void setOnClickContent(OnClickContent onClickContent) {
        this.onClickContent = onClickContent;
    }

    public Adapter_FQA(Context context, List<String> listdata_FQA, HashMap<String, List<String>> listHashMap_FQA) {
        this.context = context;
        this.listdata_FQA = listdata_FQA;
        this.listHashMap_FQA = listHashMap_FQA;
    }

    @Override
    public int getGroupCount() {
        return listdata_FQA.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listHashMap_FQA.get(listdata_FQA.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listdata_FQA.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listHashMap_FQA.get(listdata_FQA.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
         String title_FQA = (String)getGroup(groupPosition);
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_group_fqa,null);
        }
        TextView txt_title_FQA = (TextView)convertView.findViewById(R.id.txt_group_FQA);
        txt_title_FQA.setTypeface(null,Typeface.BOLD);
        txt_title_FQA.setText(title_FQA);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String content_FQA = (String)getChild(groupPosition,childPosition);
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.item_list_fqa,null);
        }
        final TextView txt_content_FQA = (TextView)convertView.findViewById(R.id.txt_item_FQA);
        txt_content_FQA.setText(content_FQA);
        txt_content_FQA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickContent !=null){
                    onClickContent.onclick(content_FQA);
                }
            }
        });
        TextView txt_content_more_read = (TextView)convertView.findViewById(R.id.more_read);
        txt_content_more_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickContent !=null){
                    onClickContent.onclick(content_FQA);
                }
            }
        });
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    public interface OnClickContent{
        void onclick(String content);
    }
}

package com.sk.whatsappusingdafaultlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewAdapter extends BaseAdapter {

    Context mcontext;
    int[] profiles;
    String[] name;
    String[] email;
    int[] dltstd;

    public ViewAdapter(Context mcontext, int[] profiles, String[] name, String[] email, int[] dltstd) {
        this.mcontext = mcontext;
        this.profiles = profiles;
        this.name = name;
        this.email = email;
        this.dltstd = dltstd;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        View myview = null;

        if (myview == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(mcontext);
            myview = layoutInflater.inflate(R.layout.design, null);
        } else {
            myview=convertView;
        }

        CircleImageView circleImageView = myview.findViewById(R.id.imageView);
        TextView nametxt = myview.findViewById(R.id.name);
        TextView emailtxt = myview.findViewById(R.id.email);
        ImageView delimg = myview.findViewById(R.id.del);

        circleImageView.setImageResource(profiles[i]);
        nametxt.setText(name[i]);
        emailtxt.setText(email[i]);
        delimg.setImageResource(dltstd[i]);


return myview;
    }
}

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.deepanjali.myapplication1.R;

class MyAdapter extends ArrayAdapter<String> {
    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater =LayoutInflater.from(getContext());
        View theView =theInflater.inflate(R.layout.row_layout_2, parent, false);

        String tvShows =getItem(position);

        TextView theTextView =(TextView)theView.findViewById(R.id.textView1);

        theTextView.setText(tvShows);

        ImageView theImageView =(ImageView)theView.findViewById(R.id.imageView1);

        theImageView.setImageResource(R.mipmap.ic_launcher);

        return theView;
    }
}

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.real_time_price_app.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import Model.model;

public class vegadaptor extends RecyclerView.Adapter<vegadaptor.ViewHolder> {
    private Context mContext;
    private ArrayList<model> List;

    public vegadaptor(Context mContext, ArrayList<model> mExampleList) {
        this.mContext = mContext;
        this.List = mExampleList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.product, parent, false);
        return new ViewHolder(v);}


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        model currentItem = List.get(position);
        String imageUrl = currentItem.getImagelink();
        String price = currentItem.getPrice();
        String name = currentItem.getName();
        holder.TextViewprice.setText("RS."+price);
        holder.TextViewname.setText(name);
        Picasso.get().load(imageUrl).fit().centerInside().into(holder.ImageViewproduct);
        /*holder.ImageViewproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,Main2lectureActivity.class);
                intent.putExtra("image",currentItem.getUrlchapter());
                // intent.putExtra("text",currentItem.getUrlchapter());
                mContext.startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView ImageViewproduct;
        public TextView TextViewprice;
        public TextView TextViewname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageViewproduct = itemView.findViewById(R.id.image);
            TextViewprice = itemView.findViewById(R.id.name);
            TextViewname = itemView.findViewById(R.id.price);
        }
    }
}

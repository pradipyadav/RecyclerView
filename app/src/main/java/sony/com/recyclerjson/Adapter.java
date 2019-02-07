package sony.com.recyclerjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{

    private Context mCtx;
    private List<Product> mData;


    public Adapter(Context mCtx, List<Product> mData) {
        this.mCtx = mCtx;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        view=inflater.inflate(R.layout.content_layout,viewGroup,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.title.setText(mData.get(i).getTitle());
        myViewHolder.description.setText(mData.get(i).getTitle());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title,description;
        ImageView imgUrl;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.title);
            description=itemView.findViewById(R.id.description);
            imgUrl=itemView.findViewById(R.id.imgUrl);
        }
    }
}

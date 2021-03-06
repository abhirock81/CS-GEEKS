package com.example.a1605476.registrationapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a1605476.registrationapp.Lectures;
import com.example.a1605476.registrationapp.Play;
import com.example.a1605476.registrationapp.R;

public class ListAdapter1 extends RecyclerView.Adapter {
    Intent intent;
    static  String[] topics={"Quiz 1","Quiz 2","Quiz 2","Quiz 3","Quiz 4","Quiz 5"};
    static String[] id={"ZnhSbXuJaqQ","7zaKUc2zfpI","oBhgyiBVd3k","T_QfRU-A3s4","Zd0TUuoPP-s"};
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list1,parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return topics.length;
    }
    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        CardView  cardView;
        Context context;
        TextView mtextView;
        public ListViewHolder(View itemview)
        {
            super(itemview);
            cardView=(CardView)itemview.findViewById(R.id.cardview);
            mtextView=(TextView)itemview.findViewById(R.id.text1);
            itemview.setOnClickListener(this);
            context=itemview.getContext();

        }

        public void bindView(int position)
        {
            mtextView.setText(topics[position]);
        }
        @Override
        public void onClick(View v) {
            intent=new Intent(context,Play.class);
            intent.putExtra("z",getItemCount());
            switch(getAdapterPosition())
            {
                case 0:
                    intent.putExtra("e",getAdapterPosition());
                    break;
                case 1:
                    intent.putExtra("e",getAdapterPosition());
                    break;
                case 2:
                    intent.putExtra("e",getAdapterPosition());
                    break;
                case 3:
                    intent.putExtra("e",getAdapterPosition());
                    break;
                case 4:
                    intent.putExtra("e",getAdapterPosition());
                    break;
                default:
            }
            context.startActivity(intent);
        }
    }
}

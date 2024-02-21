package com.unoth.dashboardapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    private List<ContactDomain> contactsList;

    public ContactAdapter(List<ContactDomain> items) {
        this.contactsList = items;
    }

    @NonNull
    @Override
    public ContactAdapter.ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item,
                parent,
                false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ContactViewHolder holder, int position) {
        holder.name.setText(contactsList.get(position).getName());
        int drawableRes = holder.itemView.getResources().getIdentifier(
                contactsList.get(position).getPicPath(),
                "drawable",
                holder.itemView.getContext().getPackageName()
        );
        Glide.with(holder.itemView.getContext())
                .load(drawableRes)
                .into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView pic;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.titleTxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}

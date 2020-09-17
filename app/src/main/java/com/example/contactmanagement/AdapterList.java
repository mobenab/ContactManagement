package com.example.contactmanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterList extends RecyclerView.Adapter<AdapterList.MyViewHolder> {

    List<Contact> contacts;
    Context context;

    public AdapterList(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Contact contact = contacts.get(position);
        holder.tvContact.setText(contact.getFirstname() + " " + contact.getLastname());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvContact;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvContact = itemView.findViewById(R.id.tvContact);
        }
    }
}

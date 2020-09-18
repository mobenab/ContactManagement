package com.example.contactmanagement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
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

    public AdapterList(List<Contact> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
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
        holder.tvName.setText(contact.getFullName());
        holder.tvWorkphone.setText(contact.getWorkphone());
        holder.tvEmail.setText(contact.getEmail());
        holder.tvCellphone.setText(contact.getCellphone());

        holder.ckCell.setChecked(contact.isPhoneDefault());
        holder.ckWork.setChecked(!contact.isPhoneDefault());

        holder.ckCell.setEnabled(false);
        holder.ckWork.setEnabled(false);

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvCellphone, tvWorkphone, tvEmail;
        CheckBox ckCell, ckWork;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvCellphone = itemView.findViewById(R.id.tvCellphone);
            tvWorkphone = itemView.findViewById(R.id.tvWorkphone);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            ckCell = itemView.findViewById(R.id.ckCell);
            ckWork = itemView.findViewById(R.id.ckWork);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = contacts.get(getLayoutPosition()).getFullName();
                    Intent intent = new Intent(context, ActivityAddModify.class);
                    intent.putExtra("name", name);
                    ((Activity) context).startActivity(intent);
                }
            });
        }
    }
}

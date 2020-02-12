package de.springco.testforlombard.NewClient;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

import java.util.ArrayList;
import java.util.List;

import de.springco.testforlombard.R;

public class NewClientAdapter extends FirestoreRecyclerAdapter<NewClentModel, NewClientAdapter.NoteHolder> {
    private OnItemClickListener listener;

    List<NewClentModel> modelList;

    public NewClientAdapter(FirestoreRecyclerOptions<NewClentModel> options) {
        super(options);
    }


    @Override
    protected void onBindViewHolder(NoteHolder holder, int position, NewClentModel model) {
        holder.textViewLastName.setText(model.getLastName() + " ");
        holder.textViewFirstName.setText(model.getFirstName() + " ");
        holder.textViewPatronymic.setText(model.getPatronymic() + " ");
        holder.textViewDateOfBirth.setText(model.getDateOfBirth() + " ");
        holder.textViewPassport.setText(model.getPassport() + " ");
        holder.textViewPhoneNumbers.setText(model.getPhoneNumber() + " ");
        holder.textViewRegistrationAddress.setText(model.getRegistrationAddress() + " ");
        holder.textViewActualAddress.setText(model.getActualAddress() + " ");
        holder.textViewPersonalID.setText(model.getPersonalID() + " ");
    }

    @Override
    public NoteHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.new_client_item,
                        parent, false);
        return new NoteHolder(v);
    }

    public void deleteItem(int position) {
        getSnapshots().getSnapshot(position).getReference().delete();
    }

    class NoteHolder extends RecyclerView.ViewHolder {
        TextView textViewLastName;
        TextView textViewFirstName;
        TextView textViewPatronymic;
        TextView textViewDateOfBirth;
        TextView textViewPassport;
        TextView textViewPhoneNumbers;
        TextView textViewRegistrationAddress;
        TextView textViewActualAddress;
        TextView textViewPersonalID;

        public NoteHolder(View itemView) {
            super(itemView);
            textViewLastName = itemView.findViewById(R.id.text_view_last_name);
            textViewFirstName = itemView.findViewById(R.id.text_view_first_name);
            textViewPatronymic = itemView.findViewById(R.id.text_view_patronymic);
            textViewDateOfBirth = itemView.findViewById(R.id.text_view_date_of_birth);
            textViewPassport = itemView.findViewById(R.id.text_view_passport);
            textViewPhoneNumbers = itemView.findViewById(R.id.text_view_phone_numbers);
            textViewRegistrationAddress = itemView.findViewById(R.id.text_view_registration_address);
            textViewActualAddress = itemView.findViewById(R.id.text_view_actual_address);
            textViewPersonalID = itemView.findViewById(R.id.text_view_personal_id);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION && listener != null) {
                        listener.onItemClick(getSnapshots().getSnapshot(position), position);
                    }
                }
            });
        }
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public void filterList(ArrayList<NewClentModel> filteredList){
        modelList = filteredList;
        notifyDataSetChanged();
    }
}
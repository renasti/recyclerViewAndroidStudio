package br.com.rentaltech.demorecyclerview.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.rentaltech.demorecyclerview.R;
import br.com.rentaltech.demorecyclerview.objetos.Person;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    //Lista person
    List<Person> persons;

    //Construtor
    public RVAdapter(List<Person> persons) {
        this.persons = persons;
    }

    //Class ViewHolder que recupera Ids do layout personalizado
    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        //Criar os atributos dos itens da lista
        CardView cv;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;

        //Construtor com os itens que são usados na lista
        PersonViewHolder(View itemView){
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }

    //Recupera quantidade de itens da lista
    @Override
    public int getItemCount(){
        return persons.size();
    }

    //Infla o layout personalizado
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_lista_pessoas, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    //Seta a mensagem ou as mensagens na tela, chamado com base na quantidade de mensagens da lista
    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i){
        personViewHolder.personName.setText(persons.get(i).getName());
        personViewHolder.personAge.setText(persons.get(i).getAge());
        personViewHolder.personPhoto.setImageResource(persons.get(i).getPhotoId());
    }

    //Chamado pelo recyclerView quando ele começa a ser observado
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

}

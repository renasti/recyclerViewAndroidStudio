package br.com.rentaltech.demorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.rentaltech.demorecyclerview.adapters.CVAdapter;
import br.com.rentaltech.demorecyclerview.adapters.RVAdapter;
import br.com.rentaltech.demorecyclerview.objetos.Person;
import br.com.rentaltech.demorecyclerview.objetos.VoceSabia;

public class MainActivity extends AppCompatActivity {

    //Recycler views
    private RecyclerView rv;
    private RecyclerView cv;

    //Listas
    private List<Person> persons;
    private List<VoceSabia> mMensagensVoceSabia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera ID primeiro recyclerView
        rv = (RecyclerView) findViewById(R.id.rv);

        //Fixa o tamanho da lista. Tenha certeza que esse tamanho não terá alteração em tempo de execução
        rv.setHasFixedSize(true);

        //Linear Layout para gerenciamento da lista
        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(lm);

        //Lista de pessoas

        persons = new ArrayList<>(); //Cria uma instancia da lista persons criada acima
        persons.add(new Person("Joana", "31 anos", R.drawable.bebe)); //add pessoa
        persons.add(new Person("Ruben", "4 anos", R.drawable.sarah)); //add pessoa
        persons.add(new Person("Otavio", "1 anos", R.drawable.lucas)); //add pessoa

        //Seta o adapter no recyclerView
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);

        //Recupera ID segundo recyclerView
        cv = (RecyclerView) findViewById(R.id.cv);

        //Fixa o tamanho da lista. Tenha certeza que esse tamanho não terá alteração em tempo de execução
        cv.setHasFixedSize(true);

        //Linear Layout para gerenciamento da lista
        LinearLayoutManager lmCV = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        cv.setLayoutManager(lmCV);

        //Lista mensagens

        mMensagensVoceSabia = new ArrayList<>(); //Cria uma instancia da lista persons criada acima
        mMensagensVoceSabia.add(new VoceSabia("Mensagem 1")); //add mensagem
        mMensagensVoceSabia.add(new VoceSabia("Mensagem 2")); //add mensagem
        mMensagensVoceSabia.add(new VoceSabia("Mensagem 3")); //add mensagem

        //Seta o adapter no recyclerView
        CVAdapter mCVAdapter = new CVAdapter(mMensagensVoceSabia);
        cv.setAdapter(mCVAdapter);


    }

}
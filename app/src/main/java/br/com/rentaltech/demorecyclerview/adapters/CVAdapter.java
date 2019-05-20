package br.com.rentaltech.demorecyclerview.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.rentaltech.demorecyclerview.R;
import br.com.rentaltech.demorecyclerview.objetos.VoceSabia;

public class CVAdapter extends RecyclerView.Adapter<CVAdapter.MensagemViewHolder> {

    //Lista mensagens
    List<VoceSabia> mListaMensagemVoceSabia;

    //Construtor
    public CVAdapter(List<VoceSabia> mListaMensagemVoceSabia){
        this.mListaMensagemVoceSabia = mListaMensagemVoceSabia;
    }

    //Class ViewHolder que recupera Ids do layout personalizado
    public static class MensagemViewHolder extends RecyclerView.ViewHolder{
        //Cria itens da lista
        CardView mCardVoceSabia;
        TextView mMensagemVoceSabia;

        MensagemViewHolder(View itemView){
            super(itemView);
            mCardVoceSabia = (CardView)itemView.findViewById(R.id.cv_voce_sabia);
            mMensagemVoceSabia = (TextView)itemView.findViewById(R.id.mensagem_vc_sabia);
        }
    }

    //Recupera quantidade de itens da lista
    @Override
    public int getItemCount(){
        return mListaMensagemVoceSabia.size();
    }

    //Infla o layout personalizado
    @Override
    public MensagemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_mensagens_voce_sabia, viewGroup, false);
        MensagemViewHolder mvh = new MensagemViewHolder(v);
        return mvh;
    }

    //Seta a mensagem ou as mensagens na tela, chamado com base na quantidade de mensagens da lista
    @Override
    public void onBindViewHolder(MensagemViewHolder mensagemViewHolder, int i){
        mensagemViewHolder.mMensagemVoceSabia.setText(mListaMensagemVoceSabia.get(i).getMensagem());
    }

    //Chamado pelo recyclerView quando ele começa a ser observado
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

}

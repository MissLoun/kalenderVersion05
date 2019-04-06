package de.projects.janap.a05_kalender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Calendar;

public class Kalender_Adapter extends BaseAdapter {

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Attribute
    private Context context;
    private int[] tage;
    private int datum = 1;
    private int ersterTag;

    private Calendar kalender;

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Konstruktor
    public Kalender_Adapter(Context pContext, int[] pTage, Calendar pKalender){
        this.context = pContext;
        this.tage = pTage;
        this.kalender = pKalender;
        kalender.set(Calendar.DAY_OF_MONTH, 1);
        ersterTag = kalender.get(Calendar.DAY_OF_WEEK)-2;   //da 1. Position 0 ist und - dem Tag
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    //Methoden
    @Override
    public int getCount() {
        return tage.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //wenn covertView = 0 ist, wird eine neue Zelle festgelegt
        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.zelle_aktueller_monat, null);

        }

        TextView textViewTag = convertView.findViewById(R.id.textview_tag);

        if (position == 0){
            if (ersterTag == 0){
                datum = 1;  //Da Fehler mit dem ersten des Monats auftrat
            }
            if(ersterTag == -1){
                ersterTag = 6;  //Da -1 Sonntag ist tritt sonst ein Fehler auf
            }
        }

         if (position >= ersterTag){    //wenn die aktuelle Position groeßer ist als der erste Tag des Monats

            if (position >= kalender.getActualMaximum(Calendar.DAY_OF_MONTH)+ersterTag){     //wenn die position groeßer ist als das Ende des Monats
                textViewTag.setText(" ");   //setzte nichts, da bereits Ende des Monats
             }else{
                 textViewTag.setText(""+datum); //setzte das Datum
                 datum++;   //setzte Datum eins hoeher
             }

        }else{
            textViewTag.setText(" ");   //setzte nichts, da noch nicht Anfang des Monats
        }

        return convertView;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////
}

package com.sloy.sevibus.utils;

import android.content.Context;
import android.content.Intent;

import com.sloy.sevibus.R;
import com.sloy.sevibus.ui.EditarFavoritaActivity;

public class IntentEditarFavorita extends Intent {
	
	public IntentEditarFavorita(Context context, long paradaID){
		super(context, EditarFavoritaActivity.class);
		this.putExtra("parada", paradaID);
	}
	
	public IntentEditarFavorita setLinea(long lineaID){
		putExtra("linea", lineaID);
		return this;
	}

}

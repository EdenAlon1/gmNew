package com.google.android.apps.messaging.ui.debug;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigFragment;
import defpackage.cpai;
import defpackage.cpar;
import defpackage.cpbs;
import defpackage.csrv;
import defpackage.csrw;
import defpackage.ctwb;
import defpackage.ctwi;
import defpackage.daec;
import defpackage.daed;
import defpackage.daee;
import defpackage.davr;
import defpackage.eg;
import defpackage.ffbr;
import defpackage.iv;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DebugMmsConfigFragment extends davr {
    public iv a;
    public daee ag;
    public csrv ah;
    private ListView ai;
    private View aj;
    public int[] b;
    public int c;
    public daed d;
    public ctwb e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.mms_config_debug_fragment, viewGroup, false);
        this.aj = inflate;
        this.ai = (ListView) inflate.findViewById(android.R.id.list);
        Spinner spinner = (Spinner) this.aj.findViewById(R.id.sim_selector);
        List m = this.e.m();
        Integer[] numArr = new Integer[m.size()];
        for (int i = 0; i < m.size(); i++) {
            numArr[i] = Integer.valueOf(((ctwi) m.get(i)).a());
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(G(), android.R.layout.simple_spinner_item, numArr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setOnItemSelectedListener(new daec(this, numArr));
        ((TextView) this.aj.findViewById(R.id.sim_title)).setOnClickListener(new View.OnClickListener() { // from class: daeb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final DebugMmsConfigFragment debugMmsConfigFragment = DebugMmsConfigFragment.this;
                iu iuVar = new iu(debugMmsConfigFragment.G());
                View inflate2 = debugMmsConfigFragment.G().getLayoutInflater().inflate(R.layout.mms_config_debug_mcc_mnc_dialog, (ViewGroup) null);
                final TextView textView = (TextView) inflate2.findViewById(R.id.mcc_entry);
                final TextView textView2 = (TextView) inflate2.findViewById(R.id.mnc_entry);
                iuVar.setView(inflate2);
                iuVar.setPositiveButton(R.string.menu_save_apn, new DialogInterface.OnClickListener() { // from class: dady
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        DebugMmsConfigFragment debugMmsConfigFragment2 = DebugMmsConfigFragment.this;
                        TextView textView3 = textView;
                        TextView textView4 = textView2;
                        try {
                            int parseInt = Integer.parseInt(textView3.getText().toString());
                            int parseInt2 = Integer.parseInt(textView4.getText().toString());
                            csrv csrvVar = debugMmsConfigFragment2.ah;
                            int i3 = debugMmsConfigFragment2.c;
                            Integer[] numArr2 = {Integer.valueOf(parseInt), Integer.valueOf(parseInt2)};
                            csrw csrwVar = (csrw) csrvVar.e.b();
                            if (csrwVar.b == null) {
                                csrwVar.b = new SparseArray();
                            }
                            csrwVar.b.put(i3, numArr2);
                            debugMmsConfigFragment2.d.a();
                            debugMmsConfigFragment2.b(false);
                        } catch (NumberFormatException e) {
                            Log.w("Bugle", "MCC or MNC passed in was not able to be parsed to an integer: ", e);
                        }
                        debugMmsConfigFragment2.a.dismiss();
                    }
                });
                iuVar.setNegativeButton(R.string.share_cancel, new DialogInterface.OnClickListener() { // from class: dadz
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        DebugMmsConfigFragment.this.a.cancel();
                    }
                });
                iuVar.d(R.string.menu_restore_default_apn, new DialogInterface.OnClickListener() { // from class: daea
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        DebugMmsConfigFragment debugMmsConfigFragment2 = DebugMmsConfigFragment.this;
                        ffbr ffbrVar = debugMmsConfigFragment2.ah.e;
                        int i3 = debugMmsConfigFragment2.c;
                        csrw csrwVar = (csrw) ffbrVar.b();
                        if (csrwVar.b != null) {
                            csrwVar.b.remove(i3);
                            if (csrwVar.b.size() == 0) {
                                csrwVar.b = null;
                            }
                        }
                        debugMmsConfigFragment2.d.a();
                        debugMmsConfigFragment2.a();
                        debugMmsConfigFragment2.a.dismiss();
                    }
                });
                iuVar.g(R.string.debug_mms_config_mcc_mnc_title);
                debugMmsConfigFragment.a = iuVar.create();
                textView.setText(String.valueOf(debugMmsConfigFragment.b[0]));
                textView2.setText(String.valueOf(debugMmsConfigFragment.b[1]));
                debugMmsConfigFragment.a.show();
            }
        });
        return this.aj;
    }

    public final void a() {
        b(true);
    }

    public final void b(boolean z) {
        daee daeeVar = this.ag;
        ffbr ffbrVar = daeeVar.a;
        eg G = G();
        int i = this.c;
        cpbs cpbsVar = (cpbs) ffbrVar.b();
        cpbsVar.getClass();
        cpai cpaiVar = (cpai) daeeVar.b.b();
        cpaiVar.getClass();
        cpar cparVar = (cpar) daeeVar.c.b();
        cparVar.getClass();
        G.getClass();
        daed daedVar = new daed(cpbsVar, cpaiVar, cparVar, G, i, z);
        this.d = daedVar;
        this.ai.setAdapter((ListAdapter) daedVar);
        this.b = ((csrw) this.ah.e.b()).a(this.c);
        TextView textView = (TextView) this.aj.findViewById(R.id.sim_title);
        int[] iArr = this.b;
        textView.setText("(" + iArr[0] + "/" + iArr[1] + ") " + G().getString(R.string.debug_sub_id_spinner_text));
    }
}

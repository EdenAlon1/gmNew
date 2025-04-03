package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elbw implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ AdapterView.OnItemSelectedListener a;
    final /* synthetic */ String b = "Enable spinner item selected";
    final /* synthetic */ elbx c;

    public elbw(elbx elbxVar, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.a = onItemSelectedListener;
        this.c = elbxVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ekyf.s();
        try {
            if (ekyf.v()) {
                this.a.onItemSelected(adapterView, view, i, j);
            } else {
                ekzm b = this.c.b(this.b);
                try {
                    this.a.onItemSelected(adapterView, view, i, j);
                    b.close();
                } finally {
                }
            }
        } finally {
            ekyf.q();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        ekyf.s();
        try {
            if (ekyf.v()) {
                this.a.onNothingSelected(adapterView);
            } else {
                ekzm b = this.c.b(this.b);
                try {
                    this.a.onNothingSelected(adapterView);
                    b.close();
                } finally {
                }
            }
        } finally {
            ekyf.q();
        }
    }
}

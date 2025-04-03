package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rm implements AdapterView.OnItemClickListener {
    final /* synthetic */ rp a;

    public rm(rp rpVar) {
        this.a = rpVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            rp rpVar = this.a;
            rpVar.d.performItemClick(view, i, rpVar.b.getItemId(i));
        }
        this.a.m();
    }
}

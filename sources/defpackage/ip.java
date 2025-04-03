package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ip implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController a;
    final /* synthetic */ ir b;

    public ip(ir irVar, AlertController alertController) {
        this.b = irVar;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.s.onClick(this.a.b, i);
        if (this.b.w) {
            return;
        }
        this.a.b.dismiss();
    }
}

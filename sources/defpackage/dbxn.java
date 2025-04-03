package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbxn extends wc {
    final /* synthetic */ dbxp a;

    public dbxn(dbxp dbxpVar) {
        this.a = dbxpVar;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (this.a.z.d(recyclerView, true)) {
            this.a.b.setVisibility(8);
        } else {
            this.a.b.setVisibility(0);
        }
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
    }
}

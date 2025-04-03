package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ehfm extends LinearLayoutManager {
    public ehfm(int i) {
        super(i);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.vx
    public final void ar(RecyclerView recyclerView, int i) {
        ehfl ehflVar = new ehfl(recyclerView.getContext());
        ehflVar.g = i;
        bl(ehflVar);
    }
}

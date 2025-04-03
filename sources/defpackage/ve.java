package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ve implements Runnable {
    final /* synthetic */ RecyclerView a;

    public ve(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vr vrVar = this.a.E;
        if (vrVar != null) {
            vrVar.d();
        }
        this.a.R = false;
    }
}

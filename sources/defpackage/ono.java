package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ono implements Runnable {
    final /* synthetic */ ont a;

    public ono(ont ontVar) {
        this.a = ontVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.a.c;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}

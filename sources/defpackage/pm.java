package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pm implements Runnable {
    final /* synthetic */ pt a;
    private final pp b;

    public pm(pt ptVar, pp ppVar) {
        this.a = ptVar;
        this.b = ppVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ob obVar;
        od odVar = this.a.c;
        if (odVar != null && (obVar = odVar.b) != null) {
            obVar.H(odVar);
        }
        View view = (View) this.a.f;
        if (view != null && view.getWindowToken() != null && this.b.i()) {
            this.a.j = this.b;
        }
        this.a.l = null;
    }
}

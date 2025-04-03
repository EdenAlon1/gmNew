package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pdh implements lkp {
    final /* synthetic */ Handler a;
    final /* synthetic */ Runnable b;

    public pdh(Handler handler, Runnable runnable) {
        this.a = handler;
        this.b = runnable;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (lkiVar == lki.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            lkrVar.P().d(this);
        }
    }
}

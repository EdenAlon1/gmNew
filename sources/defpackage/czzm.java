package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czzm implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ czzo a;

    public czzm(czzo czzoVar) {
        this.a = czzoVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        aifv aifvVar = (aifv) this.a.b.b();
        equr equrVar = this.a.n;
        equrVar.getClass();
        aifvVar.c(4, equrVar);
        this.a.i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

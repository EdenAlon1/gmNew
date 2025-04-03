package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eevj implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ eevm a;

    public eevj(eevm eevmVar) {
        this.a = eevmVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        eevm eevmVar = this.a;
        eevmVar.c();
        if (eevmVar.l == null) {
            eevmVar.l = new eevi(eevmVar);
            eevmVar.j.z(eevmVar.l);
        }
        this.a.j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}

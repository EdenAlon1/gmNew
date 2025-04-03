package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvtu implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ dvtx a;

    public dvtu(dvtx dvtxVar) {
        this.a = dvtxVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.a();
        return true;
    }
}

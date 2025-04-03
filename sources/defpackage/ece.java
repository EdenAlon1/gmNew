package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ece implements hgo {
    final /* synthetic */ ech a;
    final /* synthetic */ View b;

    public ece(ech echVar, View view) {
        this.a = echVar;
        this.b = view;
    }

    @Override // defpackage.hgo
    public final void a() {
        ech echVar = this.a;
        int i = echVar.i - 1;
        echVar.i = i;
        if (i == 0) {
            View view = this.b;
            int[] iArr = kvo.a;
            kvd.k(view, null);
            kwr.c(view, null);
            view.removeOnAttachStateChangeListener(echVar.j);
        }
    }
}

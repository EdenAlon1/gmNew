package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ecf extends ffkk implements ffji {
    final /* synthetic */ ech a;
    final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecf(ech echVar, View view) {
        super(1);
        this.a = echVar;
        this.b = view;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ech echVar = this.a;
        if (echVar.i == 0) {
            View view = this.b;
            eai eaiVar = echVar.j;
            int[] iArr = kvo.a;
            kvd.k(view, eaiVar);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(echVar.j);
            kwr.c(view, echVar.j);
        }
        echVar.i++;
        return new ece(this.a, this.b);
    }
}

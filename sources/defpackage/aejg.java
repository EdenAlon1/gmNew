package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aejg implements View.OnAttachStateChangeListener {
    final /* synthetic */ aeji a;

    public aejg(aeji aejiVar) {
        this.a = aejiVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        aeji aejiVar = this.a;
        aejiVar.s.c.b.addListener(new aejh(aejiVar));
        aejiVar.s.d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        aeji aejiVar = this.a;
        if (aejiVar.s.o()) {
            aejiVar.s.c();
        }
        if (aejiVar.t.o()) {
            aejiVar.t.c();
        }
    }
}

package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebrf implements View.OnAttachStateChangeListener {
    final /* synthetic */ ebrs a;
    final /* synthetic */ ebrp b;

    public ebrf(ebrp ebrpVar, ebrs ebrsVar) {
        this.a = ebrsVar;
        this.b = ebrpVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((ebpl) this.a).b.c(this.b.z);
        if (((ebpl) this.a).b.c) {
            this.b.h(false);
            ebrp ebrpVar = this.b;
            ebrpVar.z.b(((ebpl) this.a).b.a());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((ebpl) this.a).b.d(this.b.z);
    }
}

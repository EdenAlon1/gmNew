package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebmx implements View.OnAttachStateChangeListener {
    final /* synthetic */ ebbc a;
    final /* synthetic */ eazq b;
    final /* synthetic */ vm c;
    final /* synthetic */ vm d;
    final /* synthetic */ ebds e;
    final /* synthetic */ ebds f;
    final /* synthetic */ vm g;
    final /* synthetic */ ebna h;

    public ebmx(ebna ebnaVar, ebbc ebbcVar, eazq eazqVar, vm vmVar, vm vmVar2, ebds ebdsVar, ebds ebdsVar2, vm vmVar3) {
        this.a = ebbcVar;
        this.b = eazqVar;
        this.c = vmVar;
        this.d = vmVar2;
        this.e = ebdsVar;
        this.f = ebdsVar2;
        this.g = vmVar3;
        this.h = ebnaVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ebna ebnaVar = this.h;
        ea f = fr.f(view);
        if (ebnaVar.q.g()) {
            ((lld) this.h.q.c()).f(f, this.h.g);
        }
        this.a.c(this.h.s);
        this.b.A(this.c);
        this.c.d(0, 0);
        this.h.s.b(this.a.a());
        this.b.A(this.d);
        this.e.A(this.d);
        this.d.d(0, 0);
        this.f.A(this.g);
        ((ebmw) this.g).h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.d(this.h.s);
        this.b.C(this.d);
        this.e.C(this.d);
        this.b.C(this.c);
        this.f.C(this.g);
        if (this.h.q.g()) {
            ((lld) this.h.q.c()).k(this.h.g);
        }
    }
}

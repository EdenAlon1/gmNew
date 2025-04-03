package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebvz implements ebvw {
    private final dwch a;
    private final ebvk b;
    private final emyl c;

    public ebvz(eave eaveVar, eayo eayoVar, dwch dwchVar, emyl emylVar) {
        this.a = dwchVar;
        this.c = emylVar;
        this.b = new ebvk(this, new ebvy(this, dwchVar), eaveVar, eayoVar);
    }

    private final dvwz h(int i) {
        return g(i, emux.a);
    }

    @Override // defpackage.ebvw
    public final void a(View view, int i) {
        efbd.c();
        ebvk ebvkVar = this.b;
        ebvj ebvjVar = new ebvj(ebvkVar, view, i);
        view.addOnAttachStateChangeListener(ebvjVar);
        ebvkVar.b(view, i, ebvkVar.a.a());
        int[] iArr = kvo.a;
        if (view.isAttachedToWindow()) {
            ebvjVar.onViewAttachedToWindow(view);
        }
    }

    @Override // defpackage.ebvw
    public final void b(View view, int i) {
        efbd.c();
        this.a.b().b(view, h(i));
    }

    @Override // defpackage.ebvw
    public final void c(View view, int i) {
        efbd.c();
        this.a.b().e(view, h(i));
    }

    @Override // defpackage.ebvw
    public final void d(View view, int i, dvxb dvxbVar) {
        efbd.c();
        dvxy b = this.a.b();
        dvwz h = h(i);
        h.f(dvxbVar);
        b.b(view, h);
    }

    @Override // defpackage.ebvw
    public final void e(View view) {
        efbd.c();
        this.a.b().c(view);
    }

    @Override // defpackage.ebvw
    public final void f(dvxf dvxfVar, View view) {
        ebwb.a(this.a.a(), dvxfVar, view);
    }

    public final dvwz g(int i, emxc emxcVar) {
        dvwz a = this.a.c().a(i);
        dvxc dvxcVar = (dvxc) this.c.get();
        if (dvxcVar != null) {
            a.g(dvxcVar);
            return a;
        }
        if (emxcVar.g()) {
            a.g(((ebve) emxcVar.c()).a());
        }
        return a;
    }
}

package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class xv extends vr {
    boolean l = true;

    public abstract boolean e(wr wrVar);

    public abstract boolean f(wr wrVar, wr wrVar2, int i, int i2, int i3, int i4);

    public abstract boolean g(wr wrVar, int i, int i2, int i3, int i4);

    public abstract void j(wr wrVar);

    @Override // defpackage.vr
    public final boolean r(wr wrVar, vq vqVar, vq vqVar2) {
        int i;
        int i2;
        return (vqVar == null || ((i = vqVar.a) == (i2 = vqVar2.a) && vqVar.b == vqVar2.b)) ? e(wrVar) : g(wrVar, i, vqVar.b, i2, vqVar2.b);
    }

    @Override // defpackage.vr
    public boolean s(wr wrVar, wr wrVar2, vq vqVar, vq vqVar2) {
        int i;
        int i2;
        int i3 = vqVar.a;
        int i4 = vqVar.b;
        if (wrVar2.A()) {
            int i5 = vqVar.a;
            i2 = vqVar.b;
            i = i5;
        } else {
            i = vqVar2.a;
            i2 = vqVar2.b;
        }
        return f(wrVar, wrVar2, i3, i4, i, i2);
    }

    @Override // defpackage.vr
    public final boolean t(wr wrVar, vq vqVar, vq vqVar2) {
        int i = vqVar.a;
        int i2 = vqVar.b;
        View view = wrVar.a;
        int left = vqVar2 == null ? view.getLeft() : vqVar2.a;
        int top = vqVar2 == null ? view.getTop() : vqVar2.b;
        if (wrVar.v() || (i == left && i2 == top)) {
            j(wrVar);
            return true;
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return g(wrVar, i, i2, left, top);
    }

    @Override // defpackage.vr
    public boolean u(wr wrVar, vq vqVar, vq vqVar2) {
        int i = vqVar.a;
        int i2 = vqVar2.a;
        if (i != i2 || vqVar.b != vqVar2.b) {
            return g(wrVar, i, vqVar.b, i2, vqVar2.b);
        }
        p(wrVar);
        return false;
    }

    @Override // defpackage.vr
    public boolean v(wr wrVar) {
        return !this.l || wrVar.t();
    }

    public final void y() {
        this.l = false;
    }
}

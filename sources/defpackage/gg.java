package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gg {
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    String m;
    int n;
    CharSequence o;
    int p;
    CharSequence q;
    ArrayList r;
    ArrayList s;
    ArrayList u;
    final ArrayList e = new ArrayList();
    boolean l = true;
    boolean t = false;

    @Deprecated
    public gg() {
    }

    public final void A(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
    }

    public final void B() {
        this.t = true;
    }

    public final void C() {
        this.j = 4097;
    }

    public final void D(ViewGroup viewGroup, ea eaVar, String str) {
        eaVar.P = viewGroup;
        eaVar.x = true;
        t(viewGroup.getId(), eaVar, str);
    }

    public final void E(int i, ea eaVar) {
        x(i, eaVar, null);
    }

    public final void F(int i, int i2) {
        A(i, i2, 0, 0);
    }

    public abstract void c();

    public abstract void d();

    public void e(int i, ea eaVar, String str, int i2) {
        throw null;
    }

    public boolean i() {
        throw null;
    }

    public abstract void j();

    public abstract void k();

    public void l(ea eaVar) {
        throw null;
    }

    public void n(ea eaVar) {
        throw null;
    }

    public void o(ea eaVar, lkj lkjVar) {
        throw null;
    }

    public void p(ea eaVar) {
        throw null;
    }

    public void q(ea eaVar) {
        throw null;
    }

    final void r(gf gfVar) {
        this.e.add(gfVar);
        gfVar.d = this.f;
        gfVar.e = this.g;
        gfVar.f = this.h;
        gfVar.g = this.i;
    }

    public final void s(int i, ea eaVar) {
        e(i, eaVar, null, 1);
    }

    public final void t(int i, ea eaVar, String str) {
        e(i, eaVar, str, 1);
    }

    public final void u(ea eaVar, String str) {
        e(0, eaVar, str, 1);
    }

    public final void v(String str) {
        if (!this.l) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.k = true;
        this.m = str;
    }

    public final void w() {
        if (this.k) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.l = false;
    }

    public final void x(int i, ea eaVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        e(i, eaVar, str, 2);
    }

    public final void y(Runnable runnable) {
        z(false, runnable);
    }

    final void z(boolean z, Runnable runnable) {
        if (!z) {
            w();
        }
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(runnable);
    }

    public gg(byte[] bArr) {
    }
}

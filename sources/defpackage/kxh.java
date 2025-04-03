package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxh {
    public static final kxh a;
    public final kxd b;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            a = kxc.e;
        } else if (Build.VERSION.SDK_INT >= 30) {
            a = kxb.d;
        } else {
            a = kxd.f;
        }
    }

    private kxh(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.b = new kxc(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new kxb(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new kxa(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.b = new kwz(this, windowInsets);
        } else {
            this.b = new kwy(this, windowInsets);
        }
    }

    public static kpt i(kpt kptVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, kptVar.b - i);
        int max2 = Math.max(0, kptVar.c - i2);
        int max3 = Math.max(0, kptVar.d - i3);
        int max4 = Math.max(0, kptVar.e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? kptVar : kpt.d(max, max2, max3, max4);
    }

    public static kxh o(WindowInsets windowInsets) {
        return p(windowInsets, null);
    }

    public static kxh p(WindowInsets windowInsets, View view) {
        ksw.h(windowInsets);
        kxh kxhVar = new kxh(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int[] iArr = kvo.a;
            kxhVar.s(kve.a(view));
            kxhVar.q(view.getRootView());
            kxhVar.b.j(view.getWindowSystemUiVisibility());
        }
        return kxhVar;
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        kxd kxdVar = this.b;
        if (kxdVar instanceof kwx) {
            return ((kwx) kxdVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kxh) {
            return Objects.equals(this.b, ((kxh) obj).b);
        }
        return false;
    }

    public final kpt f(int i) {
        return this.b.a(i);
    }

    public final kpt g(int i) {
        return this.b.c(i);
    }

    @Deprecated
    public final kpt h() {
        return this.b.o();
    }

    public final int hashCode() {
        kxd kxdVar = this.b;
        if (kxdVar == null) {
            return 0;
        }
        return kxdVar.hashCode();
    }

    public final ktp j() {
        return this.b.t();
    }

    @Deprecated
    public final kxh k() {
        return this.b.u();
    }

    @Deprecated
    public final kxh l() {
        return this.b.p();
    }

    @Deprecated
    public final kxh m() {
        return this.b.q();
    }

    public final kxh n(int i, int i2, int i3, int i4) {
        return this.b.e(i, i2, i3, i4);
    }

    final void q(View view) {
        this.b.f(view);
    }

    final void r(kpt[] kptVarArr) {
        this.b.g(kptVarArr);
    }

    final void s(kxh kxhVar) {
        this.b.i(kxhVar);
    }

    public final boolean t() {
        return this.b.s();
    }

    public final boolean u(int i) {
        return this.b.m(i);
    }

    public kxh() {
        this.b = new kxd(this);
    }
}

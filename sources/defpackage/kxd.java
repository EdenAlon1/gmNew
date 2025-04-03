package defpackage;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class kxd {
    static final kxh f;
    final kxh g;

    static {
        f = (Build.VERSION.SDK_INT >= 34 ? new kwv() : Build.VERSION.SDK_INT >= 30 ? new kwu() : Build.VERSION.SDK_INT >= 29 ? new kwt() : new kws()).a().k().l().m();
    }

    public kxd(kxh kxhVar) {
        this.g = kxhVar;
    }

    public kpt a(int i) {
        return kpt.a;
    }

    public kpt c(int i) {
        if ((i & 8) == 0) {
            return kpt.a;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public kpt d() {
        return kpt.a;
    }

    public kxh e(int i, int i2, int i3, int i4) {
        return f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxd)) {
            return false;
        }
        kxd kxdVar = (kxd) obj;
        return k() == kxdVar.k() && s() == kxdVar.s() && Objects.equals(d(), kxdVar.d()) && Objects.equals(o(), kxdVar.o()) && Objects.equals(t(), kxdVar.t());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(k()), Boolean.valueOf(s()), d(), o(), t());
    }

    public boolean k() {
        return false;
    }

    public boolean m(int i) {
        return true;
    }

    public kpt o() {
        return kpt.a;
    }

    public kxh p() {
        return this.g;
    }

    public kxh q() {
        return this.g;
    }

    public boolean s() {
        return false;
    }

    public ktp t() {
        return null;
    }

    public kxh u() {
        return this.g;
    }

    public kpt v() {
        return d();
    }

    public kpt w() {
        return d();
    }

    public kpt x() {
        return d();
    }

    public void f(View view) {
    }

    public void g(kpt[] kptVarArr) {
    }

    public void i(kxh kxhVar) {
    }

    public void j(int i) {
    }

    public void r(kpt kptVar) {
    }
}

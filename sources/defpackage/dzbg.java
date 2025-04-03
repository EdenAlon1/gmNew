package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzbg {
    public abstract dzbf a();

    public abstract dzsc b();

    public abstract boolean c();

    public final dzao d() {
        return a().a();
    }

    public final dzaz e() {
        return a().e();
    }

    public final dzbb f() {
        return a().f();
    }

    public final dzbc g() {
        return a().d();
    }

    public final dzbi h() {
        return a().g();
    }

    public final dzpt i() {
        int k = k() - 1;
        if (k == 0) {
            return ((dznm) j()).c;
        }
        if (k == 2) {
            return ((dzac) f()).e;
        }
        if (k == 3) {
            return ((dzah) h()).b;
        }
        if (k == 4) {
            d();
            return ((dyzt) d().b()).a;
        }
        if (k != 5) {
            return null;
        }
        return ((dzad) g()).a;
    }

    public final dzqs j() {
        return a().c();
    }

    public final int k() {
        return a().b();
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eagt {
    public static eags r() {
        eagq eagqVar = new eagq();
        eagqVar.e(0L);
        eagqVar.i(0);
        eagqVar.e = enpd.a;
        eagqVar.j(0L);
        eagqVar.g(0L);
        eagqVar.f(0);
        eagqVar.c(0L);
        eagqVar.d(0L);
        return eagqVar;
    }

    public static eagt u(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, enip enipVar, String str6, long j2, long j3, int i3, long j4, String str7, long j5) {
        eags r = r();
        r.e(j);
        r.b(str);
        r.l(i);
        eagq eagqVar = (eagq) r;
        eagqVar.a = str2;
        eagqVar.b = str3;
        eagqVar.c = str4;
        r.i(i2);
        eagqVar.d = str5;
        eagqVar.e = enipVar;
        eagqVar.f = str6;
        r.j(j2);
        r.g(j3);
        r.f(i3);
        r.c(j4);
        eagqVar.g = str7;
        r.d(j5);
        return r.a();
    }

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract long g();

    public abstract eags h();

    public abstract enip i();

    public abstract String j();

    public abstract String k();

    public abstract String l();

    public abstract String m();

    public abstract String n();

    public abstract String o();

    public abstract String p();

    public abstract int q();

    public final easy s() {
        int q = q();
        return q != 1 ? q != 2 ? q != 3 ? q != 4 ? new eatd(j(), d()) : new eatb(j()) : eaty.a : eaua.a : new eatf(j());
    }

    public final boolean t() {
        return s().b();
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("SpecificId", earz.a(j()));
        return b.toString();
    }
}

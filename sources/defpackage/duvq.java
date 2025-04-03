package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class duvq {
    public static final duvq h;

    static {
        duvp i = i();
        i.d("");
        h = i.a();
    }

    public static duvp i() {
        duvh duvhVar = new duvh();
        duvhVar.g(-1);
        duvhVar.b(-1);
        duvhVar.c(-1);
        duvhVar.e(false);
        int i = engw.d;
        duvhVar.h(enou.a);
        duvhVar.a = (byte) (duvhVar.a | 32);
        duvhVar.f(false);
        return duvhVar;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract engw d();

    public abstract String e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract void h();
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dufs {
    public abstract dufr a();

    public abstract engw b();

    public abstract enhk c();

    public abstract enip d();

    public abstract enip e();

    public final dufs f(dufs dufsVar) {
        dufr a = a();
        a.e(dufsVar.d());
        a.f(dufsVar.e());
        a.b().j(dufsVar.b());
        enhk c = dufsVar.c();
        ducl duclVar = (ducl) a;
        if (duclVar.a == null) {
            if (duclVar.b == null) {
                duclVar.a = new enhd();
            } else {
                duclVar.a = new enhd();
                duclVar.a.g(duclVar.b);
                duclVar.b = null;
            }
        }
        duclVar.a.g(c);
        return a.a();
    }
}

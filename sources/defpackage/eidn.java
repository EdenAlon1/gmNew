package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eidn {
    public abstract eido a();

    public abstract engd b();

    public abstract engr c();

    public final void d(eidt eidtVar) {
        c().h(eidtVar);
    }

    public final void e(String str, String str2) {
        eids d = eidt.d();
        d.c("urn:ietf:params:cpim-headers:");
        d.b(str);
        d.d(str2);
        d(d.a());
    }

    public final void f(String str, String str2, String str3) {
        eids d = eidt.d();
        d.c(str);
        d.b(str2);
        d.d(str3);
        d(d.a());
    }

    public final void g(String str, String str2) {
        b().d(str, str2);
    }
}

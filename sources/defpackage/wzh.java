package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzh {
    public static final String a(alxr alxrVar) {
        appj g = alxrVar.g();
        if (g instanceof appz) {
            return ((appz) g).d();
        }
        return null;
    }

    public static final String b(alxr alxrVar) {
        appj g = alxrVar.g();
        if (g instanceof appw) {
            return ((appw) g).c();
        }
        if (g instanceof appy) {
            return ((appx) ffdx.K(((appy) g).a())).a();
        }
        if (g instanceof apps) {
            return ((apps) g).m();
        }
        return null;
    }

    public static final boolean c(alxr alxrVar) {
        alxrVar.getClass();
        String b = b(alxrVar);
        boolean z = (b == null || ffpc.J(b)) ? false : true;
        String a = a(alxrVar);
        return z || (a != null && !ffpc.J(a)) || (alxrVar.g() instanceof apmq) || (alxrVar.g() instanceof apps);
    }

    public static final boolean d(appj appjVar) {
        if (appjVar instanceof appw) {
            return true;
        }
        return appjVar instanceof apph ? e((apph) appjVar) : appjVar instanceof apmq;
    }

    public static final boolean e(apph apphVar) {
        return le.v(apphVar.b());
    }
}

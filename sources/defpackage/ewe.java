package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewe {
    public static final void a(ibt ibtVar, long j, jvj jvjVar, jpg jpgVar, ict ictVar) {
        int a = jvjVar.a(jpm.d(j));
        int a2 = jvjVar.a(jpm.c(j));
        if (a != a2) {
            ibtVar.f(jpgVar.o(a, a2), ictVar);
        }
    }

    public static final void b(List list, jun junVar, ffji ffjiVar, jwj jwjVar) {
        jvu a = junVar.a(list);
        if (jwjVar != null) {
            jwjVar.b(null, a);
        }
        ffjiVar.invoke(a);
    }

    public static final jwj c(jvw jvwVar, jvu jvuVar, jun junVar, juw juwVar, ffji ffjiVar, ffji ffjiVar2) {
        fflb fflbVar = new fflb();
        jvwVar.a.d(jvuVar, juwVar, new ewc(junVar, ffjiVar, fflbVar), ffjiVar2);
        jwj jwjVar = new jwj(jvwVar, jvwVar.a);
        jvwVar.b.set(jwjVar);
        fflbVar.a = jwjVar;
        return (jwj) fflbVar.a;
    }
}

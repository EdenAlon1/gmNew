package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evhb {
    private final Context a;
    private final evha b;

    public evhb(Context context, evha evhaVar) {
        this.a = context;
        this.b = evhaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final feau a(feef feefVar, feey feeyVar, feeq feeqVar) {
        feei feeiVar = feei.a;
        emxf.b(!feefVar.d().equals(this.a.getPackageName()), "Don't use RemoteEndpoints-created channels to access in-app gRPC services");
        duip.a();
        feek feekVar = new feek();
        emxf.b(true, "Cross-User channel must not be used with the current UserHandle.");
        evha evhaVar = this.b;
        evgx evgxVar = evhaVar.a;
        feej feejVar = new feej(feefVar, evgxVar.a, feekVar);
        feejVar.u(evgxVar.b);
        feejVar.v(evgxVar.c);
        feejVar.g(evgxVar.c);
        feejVar.j(evgxVar.d.b());
        feejVar.x(feeiVar);
        feejVar.w(feeyVar);
        feejVar.a.h = feeqVar;
        feejVar.d(new fdyv());
        feejVar.c(fdxz.a());
        feejVar.h(1L, TimeUnit.MINUTES);
        Iterator it = ((emxn) evhaVar.b).a.iterator();
        while (it.hasNext()) {
            feejVar.i((fdxp) it.next());
        }
        emxc emxcVar = evhaVar.c;
        if (emxcVar.g()) {
            feejVar.h(((Long) emxcVar.c()).longValue(), TimeUnit.SECONDS);
        }
        return feejVar.a();
    }
}

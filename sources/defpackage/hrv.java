package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrv {
    public static final hrw a() {
        return (hrw) hsj.b.a();
    }

    public static final hrw b(hrw hrwVar) {
        if (hrwVar instanceof htr) {
            htr htrVar = (htr) hrwVar;
            if (htrVar.n == hqk.a()) {
                htrVar.l = null;
                return hrwVar;
            }
        }
        if (hrwVar instanceof hts) {
            hts htsVar = (hts) hrwVar;
            if (htsVar.b == hqk.a()) {
                htsVar.a = null;
                return hrwVar;
            }
        }
        hrw a = hsj.a(hrwVar, null, false);
        a.w();
        return a;
    }

    public static final void c() {
        hsj.b().e();
    }

    public static final Object d(ffji ffjiVar, ffix ffixVar) {
        hrw htrVar;
        ffji p;
        if (ffjiVar == null) {
            return ffixVar.invoke();
        }
        hrw hrwVar = (hrw) hsj.b.a();
        if (hrwVar instanceof htr) {
            htr htrVar2 = (htr) hrwVar;
            if (htrVar2.n == hqk.a()) {
                ffji ffjiVar2 = htrVar2.l;
                ffji ffjiVar3 = htrVar2.m;
                try {
                    p = hsj.p(ffjiVar, ffjiVar2, true);
                    htrVar2.l = p;
                    htrVar2.m = hsj.q(null, ffjiVar3);
                    return ffixVar.invoke();
                } finally {
                    htrVar2.l = ffjiVar2;
                    htrVar2.m = ffjiVar3;
                }
            }
        }
        if (hrwVar == null || (hrwVar instanceof hrq)) {
            htrVar = new htr(hrwVar instanceof hrq ? (hrq) hrwVar : null, ffjiVar, null, true, false);
        } else {
            htrVar = hrwVar.b(ffjiVar);
        }
        try {
            hrw w = htrVar.w();
            try {
                Object invoke = ffixVar.invoke();
                hrw.E(w);
                return invoke;
            } catch (Throwable th) {
                hrw.E(w);
                throw th;
            }
        } finally {
            htrVar.d();
        }
    }

    public static final void e(hrw hrwVar, hrw hrwVar2, ffji ffjiVar) {
        if (hrwVar != hrwVar2) {
            hrw.E(hrwVar);
            hrwVar2.d();
        } else if (hrwVar instanceof htr) {
            ((htr) hrwVar).l = ffjiVar;
        } else if (hrwVar instanceof hts) {
            ((hts) hrwVar).a = ffjiVar;
        } else {
            Objects.toString(hrwVar);
            throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(hrwVar)));
        }
    }

    public static final void f() {
        boolean z;
        synchronized (hsj.c) {
            coq coqVar = hsj.i.d;
            z = false;
            if (coqVar != null) {
                if (coqVar.l()) {
                    z = true;
                }
            }
        }
        if (z) {
            hsj.r();
        }
    }

    public static final hrq g(ffji ffjiVar, ffji ffjiVar2) {
        hrq a;
        hrw b = hsj.b();
        hrq hrqVar = b instanceof hrq ? (hrq) b : null;
        if (hrqVar == null || (a = hrqVar.a(ffjiVar, ffjiVar2)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        return a;
    }

    public static final hrw h(ffji ffjiVar) {
        return hsj.b().b(ffjiVar);
    }

    public static final hru i(ffjm ffjmVar) {
        hsj.m(hsj.a);
        synchronized (hsj.c) {
            hsj.g = ffdx.ae(hsj.g, ffjmVar);
        }
        return new hru(ffjmVar);
    }
}

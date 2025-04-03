package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztb {
    private final cstx a;

    public ztb(cstx cstxVar) {
        cstxVar.getClass();
        this.a = cstxVar;
    }

    public static final boolean b(alxr alxrVar, alxr alxrVar2) {
        return (alxrVar2 == null || c(alxrVar) || c(alxrVar2) || !zro.c(alxrVar, alxrVar2) || Math.abs(alxrVar.n().toEpochMilli() - alxrVar2.n().toEpochMilli()) >= 60000) ? false : true;
    }

    private static final boolean c(alxr alxrVar) {
        appj g = alxrVar.g();
        if (!(g instanceof apmt)) {
            return false;
        }
        apmt apmtVar = (apmt) g;
        apmtVar.g();
        return (apmtVar.g().b & 1) != 0;
    }

    public final alxr a(alxr alxrVar) {
        appj g = alxrVar.g();
        if (!(g instanceof appw)) {
            return alxrVar;
        }
        appw appwVar = (appw) g;
        if (appwVar.c() == null || !this.a.g(appwVar.c())) {
            return alxrVar;
        }
        return null;
    }
}

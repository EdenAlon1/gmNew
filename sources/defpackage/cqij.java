package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqij {
    public static final Object a(cqgj cqgjVar) {
        if (cqjg.e(cqgjVar)) {
            cqfx cqfxVar = cqgjVar.c == 3 ? (cqfx) cqgjVar.d : cqfx.a;
            cqfxVar.getClass();
            return cqfxVar;
        }
        if (cqjg.f(cqgjVar)) {
            cqgb cqgbVar = cqgjVar.c == 4 ? (cqgb) cqgjVar.d : cqgb.a;
            cqgbVar.getClass();
            return cqgbVar;
        }
        if (!cqjg.g(cqgjVar)) {
            throw new IllegalArgumentException("Unrecognized sync type");
        }
        cqgd cqgdVar = cqgjVar.c == 5 ? (cqgd) cqgjVar.d : cqgd.a;
        cqgdVar.getClass();
        return cqgdVar;
    }

    public static final void b(csls cslsVar, cqjb cqjbVar) {
        cslsVar.A("batchId", cqjbVar.c());
    }

    public static final void c(csls cslsVar, cqgj cqgjVar, String str) {
        eyee eyeeVar = cqgjVar.e;
        eyeeVar.getClass();
        cslsVar.A(str, cqjf.b(eyeeVar));
    }

    static /* synthetic */ void d(csls cslsVar, cqgj cqgjVar) {
        c(cslsVar, cqgjVar, "syncId");
    }
}

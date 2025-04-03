package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjhu extends eyfy implements eyht {
    public static final cjhu a;
    private static volatile eyhz b;

    static {
        cjhu cjhuVar = new cjhu();
        a = cjhuVar;
        eyfy.registerDefaultInstance(cjhu.class, cjhuVar);
    }

    private cjhu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new cjhu();
        }
        if (ordinal == 4) {
            return new cjht();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cjhu.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

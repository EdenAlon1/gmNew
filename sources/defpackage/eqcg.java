package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqcg extends eyfy implements eyht {
    public static final eqcg a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        eqcg eqcgVar = new eqcg();
        a = eqcgVar;
        eyfy.registerDefaultInstance(eqcg.class, eqcgVar);
    }

    private eqcg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0000", new Object[]{"b", "c", eqce.a});
        }
        if (ordinal == 3) {
            return new eqcg();
        }
        if (ordinal == 4) {
            return new eqcf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqcg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

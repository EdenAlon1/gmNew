package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtg extends eyfy implements eyht {
    public static final rtg a;
    private static volatile eyhz f;
    public int b;
    public long c;
    public int d;
    public int e;

    static {
        rtg rtgVar = new rtg();
        a = rtgVar;
        eyfy.registerDefaultInstance(rtg.class, rtgVar);
    }

    private rtg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", rue.a, "e", rtz.a});
        }
        if (ordinal == 3) {
            return new rtg();
        }
        if (ordinal == 4) {
            return new rtf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (rtg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

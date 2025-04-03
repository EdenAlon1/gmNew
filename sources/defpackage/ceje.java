package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceje extends eyfy implements eyht {
    public static final ceje a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        ceje cejeVar = new ceje();
        a = cejeVar;
        eyfy.registerDefaultInstance(ceje.class, cejeVar);
    }

    private ceje() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", cejf.a, "e"});
        }
        if (ordinal == 3) {
            return new ceje();
        }
        if (ordinal == 4) {
            return new cejd();
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
        synchronized (ceje.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

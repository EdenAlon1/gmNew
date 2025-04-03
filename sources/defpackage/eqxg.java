package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxg extends eyfy implements eyht {
    public static final eqxg a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public long e;
    public eqpc f;
    public eqxa g;
    public int h;

    static {
        eqxg eqxgVar = new eqxg();
        a = eqxgVar;
        eyfy.registerDefaultInstance(eqxg.class, eqxgVar);
    }

    private eqxg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eqwe.a;
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006᠌\u0005", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e", "f", "g", "h", eqwr.a});
        }
        if (ordinal == 3) {
            return new eqxg();
        }
        if (ordinal == 4) {
            return new eqxf();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqxg.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

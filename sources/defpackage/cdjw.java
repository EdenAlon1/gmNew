package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdjw extends eyfy implements eyht {
    public static final eygj a = new cdjr();
    public static final cdjw b;
    private static volatile eyhz i;
    public int c;
    public int d;
    public int e;
    public int f = 1;
    public eygi g = emptyIntList();
    public int h;

    static {
        cdjw cdjwVar = new cdjw();
        b = cdjwVar;
        eyfy.registerDefaultInstance(cdjw.class, cdjwVar);
    }

    private cdjw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = cdjt.a;
            return newMessageInfo(b, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠞ\u0005᠌\u0003", new Object[]{"c", "d", "e", eyggVar, "f", cdjv.a, "g", eyggVar, "h", csgl.a});
        }
        if (ordinal == 3) {
            return new cdjw();
        }
        if (ordinal == 4) {
            return new cdjs();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cdjw.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eozx extends eyfy implements eyht {
    public static final eozx a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        eozx eozxVar = new eozx();
        a = eozxVar;
        eyfy.registerDefaultInstance(eozx.class, eozxVar);
    }

    private eozx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eozz.a;
            eygg eyggVar2 = epad.a;
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e", eozw.a, "f", eyggVar2, "g", eyggVar2});
        }
        if (ordinal == 3) {
            return new eozx();
        }
        if (ordinal == 4) {
            return new eozv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eozx.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

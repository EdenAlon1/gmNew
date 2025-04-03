package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnuv extends eyfy implements eyht {
    public static final cnuv a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        cnuv cnuvVar = new cnuv();
        a = cnuvVar;
        eyfy.registerDefaultInstance(cnuv.class, cnuvVar);
    }

    private cnuv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cnuv();
        }
        if (ordinal == 4) {
            return new cnut();
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
        synchronized (cnuv.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

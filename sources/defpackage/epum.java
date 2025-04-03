package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epum extends eyfy implements eyht {
    public static final epum a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        epum epumVar = new epum();
        a = epumVar;
        eyfy.registerDefaultInstance(epum.class, epumVar);
    }

    private epum() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", epug.a});
        }
        if (ordinal == 3) {
            return new epum();
        }
        if (ordinal == 4) {
            return new epul();
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
        synchronized (epum.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

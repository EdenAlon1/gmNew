package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eriu extends eyfy implements eyht {
    public static final eriu a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public long d;
    public long e;
    public int f;

    static {
        eriu eriuVar = new eriu();
        a = eriuVar;
        eyfy.registerDefaultInstance(eriu.class, eriuVar);
    }

    private eriu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"b", "c", erkg.a, "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new eriu();
        }
        if (ordinal == 4) {
            return new erit();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eriu.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

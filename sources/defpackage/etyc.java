package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etyc extends eyfy implements eyht {
    public static final etyc a;
    private static volatile eyhz f;
    public int b;
    public etyi c;
    public etxy d;
    public int e;

    static {
        etyc etycVar = new etyc();
        a = etycVar;
        eyfy.registerDefaultInstance(etyc.class, etycVar);
    }

    private etyc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new etyc();
        }
        if (ordinal == 4) {
            return new etyb();
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
        synchronized (etyc.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

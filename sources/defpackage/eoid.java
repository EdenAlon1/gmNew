package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoid extends eyfy implements eyht {
    public static final eoid a;
    private static volatile eyhz e;
    public int b;
    public long c;
    public int d;

    static {
        eoid eoidVar = new eoid();
        a = eoidVar;
        eyfy.registerDefaultInstance(eoid.class, eoidVar);
    }

    private eoid() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", eoic.a});
        }
        if (ordinal == 3) {
            return new eoid();
        }
        if (ordinal == 4) {
            return new eoib();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eoid.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbe extends eyfy implements eyht {
    public static final esbe a;
    private static volatile eyhz e;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        esbe esbeVar = new esbe();
        a = esbeVar;
        eyfy.registerDefaultInstance(esbe.class, esbeVar);
    }

    private esbe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0007\u0003\u0007\u0004\u0007", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new esbe();
        }
        if (ordinal == 4) {
            return new esbd();
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
        synchronized (esbe.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

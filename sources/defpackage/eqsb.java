package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsb extends eyfy implements eyht {
    public static final eqsb a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public eqpc g;

    static {
        eqsb eqsbVar = new eqsb();
        a = eqsbVar;
        eyfy.registerDefaultInstance(eqsb.class, eqsbVar);
    }

    private eqsb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eqsb();
        }
        if (ordinal == 4) {
            return new eqsa();
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
        synchronized (eqsb.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

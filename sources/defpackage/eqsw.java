package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsw extends eyfy implements eyht {
    public static final eqsw a;
    private static volatile eyhz h;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        eqsw eqswVar = new eqsw();
        a = eqswVar;
        eyfy.registerDefaultInstance(eqsw.class, eqswVar);
    }

    private eqsw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဇ\u0004\u0005᠌\u0002", new Object[]{"b", "c", "d", "f", "g", "e", eqtf.a});
        }
        if (ordinal == 3) {
            return new eqsw();
        }
        if (ordinal == 4) {
            return new eqsv();
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
        synchronized (eqsw.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

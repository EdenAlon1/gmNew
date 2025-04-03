package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdv extends eyfy implements eyht {
    public static final eqdv a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public int f;

    static {
        eqdv eqdvVar = new eqdv();
        a = eqdvVar;
        eyfy.registerDefaultInstance(eqdv.class, eqdvVar);
    }

    private eqdv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"b", "c", eqdu.a, "d", eqds.a, "e", "f", eqdr.a});
        }
        if (ordinal == 3) {
            return new eqdv();
        }
        if (ordinal == 4) {
            return new eqdt();
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
        synchronized (eqdv.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

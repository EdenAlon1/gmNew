package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqea extends eyfy implements eyht {
    public static final eqea a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public String g = "";

    static {
        eqea eqeaVar = new eqea();
        a = eqeaVar;
        eyfy.registerDefaultInstance(eqea.class, eqeaVar);
    }

    private eqea() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004", new Object[]{"b", "c", eqdx.a, "d", eqdy.a, "e", "f", eqdz.a, "g"});
        }
        if (ordinal == 3) {
            return new eqea();
        }
        if (ordinal == 4) {
            return new eqdw();
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
        synchronized (eqea.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eryk extends eyfy implements eyht {
    public static final eryk a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public eryi f;

    static {
        eryk erykVar = new eryk();
        a = erykVar;
        eyfy.registerDefaultInstance(eryk.class, erykVar);
    }

    private eryk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0004\u0003Ȉ\u0004\f\u0005ဉ\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new eryk();
        }
        if (ordinal == 4) {
            return new eryj();
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
        synchronized (eryk.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

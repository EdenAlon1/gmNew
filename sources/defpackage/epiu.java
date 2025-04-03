package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epiu extends eyfy implements eyht {
    public static final epiu a;
    private static volatile eyhz h;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;

    static {
        epiu epiuVar = new epiu();
        a = epiuVar;
        eyfy.registerDefaultInstance(epiu.class, epiuVar);
    }

    private epiu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", eoth.a, "g"});
        }
        if (ordinal == 3) {
            return new epiu();
        }
        if (ordinal == 4) {
            return new epit();
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
        synchronized (epiu.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

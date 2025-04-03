package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epys extends eyfy implements eyht {
    public static final epys a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public epyu e;
    public int f;

    static {
        epys epysVar = new epys();
        a = epysVar;
        eyfy.registerDefaultInstance(epys.class, epysVar);
    }

    private epys() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", epyp.a, "d", epyr.a, "e", "f", epyq.a});
        }
        if (ordinal == 3) {
            return new epys();
        }
        if (ordinal == 4) {
            return new epyo();
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
        synchronized (epys.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

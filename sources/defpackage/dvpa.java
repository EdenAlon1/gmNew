package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvpa extends eyfy implements eyht {
    public static final dvpa a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        dvpa dvpaVar = new dvpa();
        a = dvpaVar;
        eyfy.registerDefaultInstance(dvpa.class, dvpaVar);
    }

    private dvpa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dvoz.a});
        }
        if (ordinal == 3) {
            return new dvpa();
        }
        if (ordinal == 4) {
            return new dvoy();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dvpa.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

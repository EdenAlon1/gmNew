package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czek extends eyfy implements eyht {
    public static final czek a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        czek czekVar = new czek();
        a = czekVar;
        eyfy.registerDefaultInstance(czek.class, czekVar);
    }

    private czek() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", czej.a});
        }
        if (ordinal == 3) {
            return new czek();
        }
        if (ordinal == 4) {
            return new czei();
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
        synchronized (czek.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

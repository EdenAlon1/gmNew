package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fara extends eyfy implements eyht {
    public static final fara a;
    private static volatile eyhz b;
    private int c;
    private faro d;

    static {
        fara faraVar = new fara();
        a = faraVar;
        eyfy.registerDefaultInstance(fara.class, faraVar);
    }

    private fara() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0002", new Object[]{"c", "d"});
        }
        if (ordinal == 3) {
            return new fara();
        }
        if (ordinal == 4) {
            return new faqz();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fara.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

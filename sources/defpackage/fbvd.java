package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvd extends eyfy implements eyht {
    public static final fbvd a;
    private static volatile eyhz c;
    public int b;

    static {
        fbvd fbvdVar = new fbvd();
        a = fbvdVar;
        eyfy.registerDefaultInstance(fbvd.class, fbvdVar);
    }

    private fbvd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fbvd();
        }
        if (ordinal == 4) {
            return new fbvb();
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
        synchronized (fbvd.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

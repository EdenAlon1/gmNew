package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvp extends eyfy implements eyht {
    public static final fbvp a;
    private static volatile eyhz c;
    public long b;

    static {
        fbvp fbvpVar = new fbvp();
        a = fbvpVar;
        eyfy.registerDefaultInstance(fbvp.class, fbvpVar);
    }

    private fbvp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fbvp();
        }
        if (ordinal == 4) {
            return new fbvo();
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
        synchronized (fbvp.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

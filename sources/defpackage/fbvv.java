package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvv extends eyfy implements eyht {
    public static final fbvv a;
    private static volatile eyhz b;

    static {
        fbvv fbvvVar = new fbvv();
        a = fbvvVar;
        eyfy.registerDefaultInstance(fbvv.class, fbvvVar);
    }

    private fbvv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0000", null);
        }
        if (ordinal == 3) {
            return new fbvv();
        }
        if (ordinal == 4) {
            return new fbvu();
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
        synchronized (fbvv.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

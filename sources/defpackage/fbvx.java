package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvx extends eyfy implements eyht {
    public static final fbvx a;
    private static volatile eyhz b;

    static {
        fbvx fbvxVar = new fbvx();
        a = fbvxVar;
        eyfy.registerDefaultInstance(fbvx.class, fbvxVar);
    }

    private fbvx() {
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
            return new fbvx();
        }
        if (ordinal == 4) {
            return new fbvw();
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
        synchronized (fbvx.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

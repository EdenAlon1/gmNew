package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbso extends eyfy implements eyht {
    public static final fbso a;
    private static volatile eyhz b;

    static {
        fbso fbsoVar = new fbso();
        a = fbsoVar;
        eyfy.registerDefaultInstance(fbso.class, fbsoVar);
    }

    private fbso() {
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
            return new fbso();
        }
        if (ordinal == 4) {
            return new fbsn();
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
        synchronized (fbso.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

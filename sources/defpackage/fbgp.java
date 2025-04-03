package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbgp extends eyfy implements eyht {
    public static final fbgp a;
    private static volatile eyhz b;
    private eyhm c = eyhm.a;

    static {
        fbgp fbgpVar = new fbgp();
        a = fbgpVar;
        eyfy.registerDefaultInstance(fbgp.class, fbgpVar);
    }

    private fbgp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", fbgo.a});
        }
        if (ordinal == 3) {
            return new fbgp();
        }
        if (ordinal == 4) {
            return new fbgn();
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
        synchronized (fbgp.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

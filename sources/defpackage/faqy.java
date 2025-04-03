package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faqy extends eyfy implements eyht {
    public static final faqy a;
    private static volatile eyhz b;
    private eyhm c = eyhm.a;

    static {
        faqy faqyVar = new faqy();
        a = faqyVar;
        eyfy.registerDefaultInstance(faqy.class, faqyVar);
    }

    private faqy() {
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
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0001\u0000\u0000\u00072", new Object[]{"c", faqx.a});
        }
        if (ordinal == 3) {
            return new faqy();
        }
        if (ordinal == 4) {
            return new faqw();
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
        synchronized (faqy.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

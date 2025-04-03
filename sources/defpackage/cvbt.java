package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvbt extends eyfy implements eyht {
    public static final cvbt a;
    private static volatile eyhz f;
    public int b;
    public eyee c = eyee.b;
    public eyee d = eyee.b;
    public eyja e;

    static {
        cvbt cvbtVar = new cvbt();
        a = cvbtVar;
        eyfy.registerDefaultInstance(cvbt.class, cvbtVar);
    }

    private cvbt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001\n\u0002\n\bဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new cvbt();
        }
        if (ordinal == 4) {
            return new cvbs();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cvbt.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

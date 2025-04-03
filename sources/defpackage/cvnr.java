package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvnr extends eyfy implements eyht {
    public static final cvnr a;
    private static volatile eyhz f;
    public long c;
    public boolean e;
    public String b = "";
    public String d = "";

    static {
        cvnr cvnrVar = new cvnr();
        a = cvnrVar;
        eyfy.registerDefaultInstance(cvnr.class, cvnrVar);
    }

    private cvnr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new cvnr();
        }
        if (ordinal == 4) {
            return new cvnq();
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
        synchronized (cvnr.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

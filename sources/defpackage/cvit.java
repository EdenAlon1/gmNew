package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvit extends eyfy implements eyht {
    public static final cvit a;
    private static volatile eyhz e;
    public Object c;
    public int b = 0;
    public String d = "";

    static {
        cvit cvitVar = new cvit();
        a = cvitVar;
        eyfy.registerDefaultInstance(cvit.class, cvitVar);
    }

    private cvit() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", "d", cvia.class, cvic.class, cvim.class});
        }
        if (ordinal == 3) {
            return new cvit();
        }
        if (ordinal == 4) {
            return new cvir();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cvit.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

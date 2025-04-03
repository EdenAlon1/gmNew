package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvii extends eyfy implements eyht {
    public static final cvii a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        cvii cviiVar = new cvii();
        a = cviiVar;
        eyfy.registerDefaultInstance(cvii.class, cviiVar);
    }

    private cvii() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "d", cvhx.class, cvif.class});
        }
        if (ordinal == 3) {
            return new cvii();
        }
        if (ordinal == 4) {
            return new cvig();
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
        synchronized (cvii.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

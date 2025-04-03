package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvio extends eyfy implements eyht {
    public static final cvio a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public cvht e;

    static {
        cvio cvioVar = new cvio();
        a = cvioVar;
        eyfy.registerDefaultInstance(cvio.class, cvioVar);
    }

    private cvio() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000", new Object[]{"d", "c", "b", "e", cvhx.class});
        }
        if (ordinal == 3) {
            return new cvio();
        }
        if (ordinal == 4) {
            return new cvin();
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
        synchronized (cvio.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awww extends eyfy implements eyht {
    public static final awww a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public awxf d;
    public awui e;
    public String f = "";

    static {
        awww awwwVar = new awww();
        a = awwwVar;
        eyfy.registerDefaultInstance(awww.class, awwwVar);
    }

    private awww() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", awwu.a, "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new awww();
        }
        if (ordinal == 4) {
            return new awwt();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awww.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

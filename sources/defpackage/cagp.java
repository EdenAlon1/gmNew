package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagp extends eyfy implements eyht {
    public static final cagp a;
    private static volatile eyhz e;
    public int b;
    public awui c;
    public String d = "";

    static {
        cagp cagpVar = new cagp();
        a = cagpVar;
        eyfy.registerDefaultInstance(cagp.class, cagpVar);
    }

    private cagp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cagp();
        }
        if (ordinal == 4) {
            return new cago();
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
        synchronized (cagp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cotg extends eyfy implements eyht {
    public static final cotg a;
    private static volatile eyhz g;
    public int b;
    public cotk c;
    public eyee d = eyee.b;
    public eyja e;
    public int f;

    static {
        cotg cotgVar = new cotg();
        a = cotgVar;
        eyfy.registerDefaultInstance(cotg.class, cotgVar);
    }

    private cotg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", cote.a});
        }
        if (ordinal == 3) {
            return new cotg();
        }
        if (ordinal == 4) {
            return new cotd();
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
        synchronized (cotg.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

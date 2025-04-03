package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cggw extends eyfy implements eyht {
    public static final cggw a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public boolean d;

    static {
        cggw cggwVar = new cggw();
        a = cggwVar;
        eyfy.registerDefaultInstance(cggw.class, cggwVar);
    }

    private cggw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002\u0007", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cggw();
        }
        if (ordinal == 4) {
            return new cggv();
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
        synchronized (cggw.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cntf extends eyfy implements eyht {
    public static final cntf a;
    private static volatile eyhz e;
    public int b;
    public cnuv c;
    public int d;

    static {
        cntf cntfVar = new cntf();
        a = cntfVar;
        eyfy.registerDefaultInstance(cntf.class, cntfVar);
    }

    private cntf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cntf();
        }
        if (ordinal == 4) {
            return new cnte();
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
        synchronized (cntf.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

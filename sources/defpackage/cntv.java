package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cntv extends eyfy implements eyht {
    public static final cntv a;
    private static volatile eyhz e;
    public int b;
    public cnso c;
    public int d;

    static {
        cntv cntvVar = new cntv();
        a = cntvVar;
        eyfy.registerDefaultInstance(cntv.class, cntvVar);
    }

    private cntv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cntv();
        }
        if (ordinal == 4) {
            return new cntt();
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
        synchronized (cntv.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

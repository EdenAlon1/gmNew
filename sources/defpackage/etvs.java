package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etvs extends eyfy implements eyht {
    public static final etvs a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public etvu d;

    static {
        etvs etvsVar = new etvs();
        a = etvsVar;
        eyfy.registerDefaultInstance(etvs.class, etvsVar);
    }

    private etvs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new etvs();
        }
        if (ordinal == 4) {
            return new etvr();
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
        synchronized (etvs.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

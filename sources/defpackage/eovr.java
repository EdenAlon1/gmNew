package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eovr extends eyfy implements eyht {
    public static final eovr a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public long d;
    public int e;

    static {
        eovr eovrVar = new eovr();
        a = eovrVar;
        eyfy.registerDefaultInstance(eovr.class, eovrVar);
    }

    private eovr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"b", "c", eovn.a, "d", "e", eovp.a});
        }
        if (ordinal == 3) {
            return new eovr();
        }
        if (ordinal == 4) {
            return new eovm();
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
        synchronized (eovr.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edfq extends eyfy implements eyht {
    public static final edfq a;
    private static volatile eyhz f;
    public edew b;
    public int c;
    public long d;
    public int e;
    private int g;

    static {
        edfq edfqVar = new edfq();
        a = edfqVar;
        eyfy.registerDefaultInstance(edfq.class, edfqVar);
    }

    private edfq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new edfq();
        }
        if (ordinal == 4) {
            return new edfp();
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
        synchronized (edfq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

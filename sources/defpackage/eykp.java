package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eykp extends eyfy implements eyht {
    public static final eykp a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        eykp eykpVar = new eykp();
        a = eykpVar;
        eyfy.registerDefaultInstance(eykp.class, eykpVar);
    }

    private eykp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eykp();
        }
        if (ordinal == 4) {
            return new eyko();
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
        synchronized (eykp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

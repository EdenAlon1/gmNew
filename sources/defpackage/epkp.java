package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epkp extends eyfy implements eyht {
    public static final epkp a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        epkp epkpVar = new epkp();
        a = epkpVar;
        eyfy.registerDefaultInstance(epkp.class, epkpVar);
    }

    private epkp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0006᠌\u0001\u0007᠌\u0002", new Object[]{"b", "c", epkr.a, "d", epkn.a, "e", epko.a});
        }
        if (ordinal == 3) {
            return new epkp();
        }
        if (ordinal == 4) {
            return new epkm();
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
        synchronized (epkp.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

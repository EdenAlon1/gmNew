package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzb extends eyfy implements eyht {
    public static final epzb a;
    private static volatile eyhz f;
    public int b;
    public eqad c;
    public epzq d;
    public int e;

    static {
        epzb epzbVar = new epzb();
        a = epzbVar;
        eyfy.registerDefaultInstance(epzb.class, epzbVar);
    }

    private epzb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", epza.a});
        }
        if (ordinal == 3) {
            return new epzb();
        }
        if (ordinal == 4) {
            return new epyz();
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
        synchronized (epzb.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

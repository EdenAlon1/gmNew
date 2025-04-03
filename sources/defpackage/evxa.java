package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evxa extends eyfy implements eyht {
    public static final evxa a;
    private static volatile eyhz f;
    public int b;
    public eygr c = emptyProtobufList();
    public int d;
    public int e;

    static {
        evxa evxaVar = new evxa();
        a = evxaVar;
        eyfy.registerDefaultInstance(evxa.class, evxaVar);
    }

    private evxa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002င\u0000\u0003င\u0001\u0004\u001b", new Object[]{"b", "d", "e", "c", evwt.class});
        }
        if (ordinal == 3) {
            return new evxa();
        }
        if (ordinal == 4) {
            return new evwz();
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
        synchronized (evxa.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

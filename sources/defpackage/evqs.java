package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evqs extends eyfy implements eyht {
    public static final evqs a;
    private static volatile eyhz f;
    public int b;
    public eyee c = eyee.b;
    public eygi d = emptyIntList();
    public eygi e = emptyIntList();

    static {
        evqs evqsVar = new evqs();
        a = evqsVar;
        eyfy.registerDefaultInstance(evqs.class, evqsVar);
    }

    private evqs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0007\n\u0003\u0000\u0002\u0000\u0007ည\u0001\t\u0016\n\u0016", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new evqs();
        }
        if (ordinal == 4) {
            return new evqr();
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
        synchronized (evqs.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eulh extends eyfy implements eyht {
    public static final eulh a;
    private static volatile eyhz f;
    public eygi b = emptyIntList();
    public eygi c = emptyIntList();
    public eygi d = emptyIntList();
    public eygi e = emptyIntList();

    static {
        eulh eulhVar = new eulh();
        a = eulhVar;
        eyfy.registerDefaultInstance(eulh.class, eulhVar);
    }

    private eulh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eulh();
        }
        if (ordinal == 4) {
            return new eulg();
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
        synchronized (eulh.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

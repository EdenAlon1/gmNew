package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euau extends eyfy implements eyht {
    public static final euau a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        euau euauVar = new euau();
        a = euauVar;
        eyfy.registerDefaultInstance(euau.class, euauVar);
    }

    private euau() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0004", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new euau();
        }
        if (ordinal == 4) {
            return new euat();
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
        synchronized (euau.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

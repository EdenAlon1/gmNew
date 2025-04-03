package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epgo extends eyfy implements eyht {
    public static final epgo a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public boolean d;
    public int e;

    static {
        epgo epgoVar = new epgo();
        a = epgoVar;
        eyfy.registerDefaultInstance(epgo.class, epgoVar);
    }

    private epgo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new epgo();
        }
        if (ordinal == 4) {
            return new epgn();
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
        synchronized (epgo.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

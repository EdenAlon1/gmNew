package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epei extends eyfy implements eyht {
    public static final epei a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e = 22;

    static {
        epei epeiVar = new epei();
        a = epeiVar;
        eyfy.registerDefaultInstance(epei.class, epeiVar);
    }

    private epei() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", epee.a, "d", epfb.a, "e", epef.a});
        }
        if (ordinal == 3) {
            return new epei();
        }
        if (ordinal == 4) {
            return new epeh();
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
        synchronized (epei.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

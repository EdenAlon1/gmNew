package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epvr extends eyfy implements eyht {
    public static final epvr a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        epvr epvrVar = new epvr();
        a = epvrVar;
        eyfy.registerDefaultInstance(epvr.class, epvrVar);
    }

    private epvr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", epvn.a, "d", epvl.a, "e", epvs.a});
        }
        if (ordinal == 3) {
            return new epvr();
        }
        if (ordinal == 4) {
            return new epvq();
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
        synchronized (epvr.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

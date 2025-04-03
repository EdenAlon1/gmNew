package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epry extends eyfy implements eyht {
    public static final epry a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public int e;

    static {
        epry epryVar = new epry();
        a = epryVar;
        eyfy.registerDefaultInstance(epry.class, epryVar);
    }

    private epry() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", epsf.a, epse.class, epsb.class});
        }
        if (ordinal == 3) {
            return new epry();
        }
        if (ordinal == 4) {
            return new eprx();
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
        synchronized (epry.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epho extends eyfy implements eyht {
    public static final epho a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;

    static {
        epho ephoVar = new epho();
        a = ephoVar;
        eyfy.registerDefaultInstance(epho.class, ephoVar);
    }

    private epho() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", ephl.a, "d", ephn.a, "e", "f"});
        }
        if (ordinal == 3) {
            return new epho();
        }
        if (ordinal == 4) {
            return new ephk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epho.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

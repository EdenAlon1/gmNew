package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephx extends eyfy implements eyht {
    public static final ephx a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ephx ephxVar = new ephx();
        a = ephxVar;
        eyfy.registerDefaultInstance(ephx.class, ephxVar);
    }

    private ephx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", epht.a, "d", ephu.a, "e", ephw.a});
        }
        if (ordinal == 3) {
            return new ephx();
        }
        if (ordinal == 4) {
            return new ephs();
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
        synchronized (ephx.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

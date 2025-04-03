package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eozk extends eyfy implements eyht {
    public static final eozk a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        eozk eozkVar = new eozk();
        a = eozkVar;
        eyfy.registerDefaultInstance(eozk.class, eozkVar);
    }

    private eozk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"b", "c", "d", eozi.a, "e"});
        }
        if (ordinal == 3) {
            return new eozk();
        }
        if (ordinal == 4) {
            return new eozh();
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
        synchronized (eozk.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

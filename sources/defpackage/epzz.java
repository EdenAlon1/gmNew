package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epzz extends eyfy implements eyht {
    public static final epzz a;
    private static volatile eyhz g;
    public int b;
    public eqad c;
    public int d;
    public int e;
    public int f;

    static {
        epzz epzzVar = new epzz();
        a = epzzVar;
        eyfy.registerDefaultInstance(epzz.class, epzzVar);
    }

    private epzz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", epzy.a});
        }
        if (ordinal == 3) {
            return new epzz();
        }
        if (ordinal == 4) {
            return new epzx();
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
        synchronized (epzz.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eppp extends eyfy implements eyht {
    public static final eppp a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public eppr d;
    public int e;
    public int f;
    public eqaw g;

    static {
        eppp epppVar = new eppp();
        a = epppVar;
        eyfy.registerDefaultInstance(eppp.class, epppVar);
    }

    private eppp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"b", "c", eppn.a, "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eppp();
        }
        if (ordinal == 4) {
            return new eppo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eppp.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

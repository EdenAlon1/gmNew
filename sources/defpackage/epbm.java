package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epbm extends eyfy implements eyht {
    public static final epbm a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public long d;
    public long e;

    static {
        epbm epbmVar = new epbm();
        a = epbmVar;
        eyfy.registerDefaultInstance(epbm.class, epbmVar);
    }

    private epbm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"b", "c", epbl.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new epbm();
        }
        if (ordinal == 4) {
            return new epbk();
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
        synchronized (epbm.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

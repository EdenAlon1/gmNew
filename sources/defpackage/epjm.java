package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epjm extends eyfy implements eyht {
    public static final epjm a;
    private static volatile eyhz f;
    public int b;
    public float c;
    public boolean d;
    public boolean e;

    static {
        epjm epjmVar = new epjm();
        a = epjmVar;
        eyfy.registerDefaultInstance(epjm.class, epjmVar);
    }

    private epjm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new epjm();
        }
        if (ordinal == 4) {
            return new epjl();
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
        synchronized (epjm.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

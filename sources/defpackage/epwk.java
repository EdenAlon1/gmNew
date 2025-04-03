package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwk extends eyfy implements eyht {
    public static final epwk a;
    private static volatile eyhz g;
    public int b;
    public epwq c;
    public boolean d;
    public boolean e;
    public int f;

    static {
        epwk epwkVar = new epwk();
        a = epwkVar;
        eyfy.registerDefaultInstance(epwk.class, epwkVar);
    }

    private epwk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", epwi.a});
        }
        if (ordinal == 3) {
            return new epwk();
        }
        if (ordinal == 4) {
            return new epwh();
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
        synchronized (epwk.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epwy extends eyfy implements eyht {
    public static final epwy a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;
    public eyev f;

    static {
        epwy epwyVar = new epwy();
        a = epwyVar;
        eyfy.registerDefaultInstance(epwy.class, epwyVar);
    }

    private epwy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001e\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001e<\u0000", new Object[]{"d", "c", "b", "e", "f", epxa.class});
        }
        if (ordinal == 3) {
            return new epwy();
        }
        if (ordinal == 4) {
            return new epwx();
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
        synchronized (epwy.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

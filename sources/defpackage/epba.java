package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epba extends eyfy implements eyht {
    public static final epba a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public boolean d;
    public int e;

    static {
        epba epbaVar = new epba();
        a = epbaVar;
        eyfy.registerDefaultInstance(epba.class, epbaVar);
    }

    private epba() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new epba();
        }
        if (ordinal == 4) {
            return new epaz();
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
        synchronized (epba.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

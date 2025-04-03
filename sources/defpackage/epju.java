package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epju extends eyfy implements eyht {
    public static final epju a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public epjq d;
    public eygr e = emptyProtobufList();

    static {
        epju epjuVar = new epju();
        a = epjuVar;
        eyfy.registerDefaultInstance(epju.class, epjuVar);
    }

    private epju() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", epka.class});
        }
        if (ordinal == 3) {
            return new epju();
        }
        if (ordinal == 4) {
            return new epjt();
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
        synchronized (epju.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

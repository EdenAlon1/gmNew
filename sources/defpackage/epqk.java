package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqk extends eyfy implements eyht {
    public static final epqk a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public int d;
    public int e;

    static {
        epqk epqkVar = new epqk();
        a = epqkVar;
        eyfy.registerDefaultInstance(epqk.class, epqkVar);
    }

    private epqk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new epqk();
        }
        if (ordinal == 4) {
            return new epqj();
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
        synchronized (epqk.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

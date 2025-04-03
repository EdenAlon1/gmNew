package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class epbu extends eyfy implements eyht {
    public static final epbu a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public int d;
    public long e;
    public boolean f;

    static {
        epbu epbuVar = new epbu();
        a = epbuVar;
        eyfy.registerDefaultInstance(epbu.class, epbuVar);
    }

    private epbu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new epbu();
        }
        if (ordinal == 4) {
            return new epbt();
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
        synchronized (epbu.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

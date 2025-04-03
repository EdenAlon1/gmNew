package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class farq extends eyfy implements eyht {
    public static final farq a;
    private static volatile eyhz c;
    public long b;
    private int d;

    static {
        farq farqVar = new farq();
        a = farqVar;
        eyfy.registerDefaultInstance(farq.class, farqVar);
    }

    private farq() {
        emptyLongList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0004", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new farq();
        }
        if (ordinal == 4) {
            return new farp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (farq.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

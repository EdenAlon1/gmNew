package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czuk extends eyfy<czuk, czuj> implements eyht {
    public static final czuk a;
    private static volatile eyhz g;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;

    static {
        czuk czukVar = new czuk();
        a = czukVar;
        eyfy.registerDefaultInstance(czuk.class, czukVar);
    }

    private czuk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0004ဇ\u0002\u0005င\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new czuk();
        }
        if (ordinal == 4) {
            return new czuj();
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
        synchronized (czuk.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

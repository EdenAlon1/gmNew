package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eshx extends eyfy implements eyht {
    public static final eshx a;
    private static volatile eyhz h;
    public int b;
    public esif c;
    public boolean d;
    public int e;
    public long f;
    public String g = "";

    static {
        eshx eshxVar = new eshx();
        a = eshxVar;
        eyfy.registerDefaultInstance(eshx.class, eshxVar);
    }

    private eshx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003\f\u0004\u0002\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eshx();
        }
        if (ordinal == 4) {
            return new eshw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eshx.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

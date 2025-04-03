package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exyb extends eyfy implements eyht {
    public static final exyb a;
    private static volatile eyhz e;
    public Object c;
    private int f;
    public int b = 0;
    public String d = "";

    static {
        exyb exybVar = new exyb();
        a = exybVar;
        eyfy.registerDefaultInstance(exyb.class, exybVar);
    }

    private exyb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0002\u0006\u0005\u0000\u0000\u0000\u0002ဈ\u0000\u0003;\u0000\u0004;\u0000\u0005:\u0000\u0006:\u0000", new Object[]{"c", "b", "f", "d"});
        }
        if (ordinal == 3) {
            return new exyb();
        }
        if (ordinal == 4) {
            return new exya();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exyb.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

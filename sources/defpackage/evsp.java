package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsp extends eyfy implements eyht {
    public static final evsp a;
    private static volatile eyhz g;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";
    public String f = "";

    static {
        evsp evspVar = new evsp();
        a = evspVar;
        eyfy.registerDefaultInstance(evsp.class, evspVar);
    }

    private evsp() {
        eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\u083f\u0000\u0002;\u0000\u0003ဈ\u0000\u0004;\u0000\u0005ဈ\u0001\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", evjp.a, "e", "f", evst.class, evsr.class});
        }
        if (ordinal == 3) {
            return new evsp();
        }
        if (ordinal == 4) {
            return new evso();
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
        synchronized (evsp.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

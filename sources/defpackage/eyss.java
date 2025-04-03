package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyss extends eyfy implements eyht {
    public static final eyss a;
    private static volatile eyhz g;
    public int b;
    public int d;
    public int f;
    public String c = "";
    public String e = "";

    static {
        eyss eyssVar = new eyss();
        a = eyssVar;
        eyfy.registerDefaultInstance(eyss.class, eyssVar);
    }

    private eyss() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", ezej.a});
        }
        if (ordinal == 3) {
            return new eyss();
        }
        if (ordinal == 4) {
            return new eysr();
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
        synchronized (eyss.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

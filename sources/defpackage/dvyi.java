package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvyi extends eyfy implements eyht {
    public static final dvyi a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public int d;

    static {
        dvyi dvyiVar = new dvyi();
        a = dvyiVar;
        eyfy.registerDefaultInstance(dvyi.class, dvyiVar);
    }

    private dvyi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", dvyg.a});
        }
        if (ordinal == 3) {
            return new dvyi();
        }
        if (ordinal == 4) {
            return new dvyf();
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
        synchronized (dvyi.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

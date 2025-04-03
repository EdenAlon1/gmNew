package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfl extends eyfy implements eyht {
    public static final dvfl a;
    private static volatile eyhz g;
    public int b;
    public evts c;
    public long e;
    public String d = "";
    public String f = "";

    static {
        dvfl dvflVar = new dvfl();
        a = dvflVar;
        eyfy.registerDefaultInstance(dvfl.class, dvflVar);
    }

    private dvfl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new dvfl();
        }
        if (ordinal == 4) {
            return new dvfk();
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
        synchronized (dvfl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

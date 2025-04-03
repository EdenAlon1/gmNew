package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awyj extends eyfy implements eyht {
    public static final awyj a;
    private static volatile eyhz g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public axad f;

    static {
        awyj awyjVar = new awyj();
        a = awyjVar;
        eyfy.registerDefaultInstance(awyj.class, awyjVar);
    }

    private awyj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new awyj();
        }
        if (ordinal == 4) {
            return new awyi();
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
        synchronized (awyj.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

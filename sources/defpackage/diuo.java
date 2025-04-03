package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diuo extends eyfy implements eyht {
    public static final diuo a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public String d = "";
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        diuo diuoVar = new diuo();
        a = diuoVar;
        eyfy.registerDefaultInstance(diuo.class, diuoVar);
    }

    private diuo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new diuo();
        }
        if (ordinal == 4) {
            return new diun();
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
        synchronized (diuo.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

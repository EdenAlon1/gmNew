package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbcq extends eyfy implements eyht {
    public static final fbcq a;
    private static volatile eyhz f;
    public boolean b;
    public String c = "";
    public String d = "";
    public boolean e;
    private int g;

    static {
        fbcq fbcqVar = new fbcq();
        a = fbcqVar;
        eyfy.registerDefaultInstance(fbcq.class, fbcqVar);
    }

    private fbcq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fbcq();
        }
        if (ordinal == 4) {
            return new fbcp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbcq.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbwv extends eyfy implements eyht {
    public static final fbwv a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        fbwv fbwvVar = new fbwv();
        a = fbwvVar;
        eyfy.registerDefaultInstance(fbwv.class, fbwvVar);
    }

    private fbwv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", fbvt.class, fbuy.class, fbwd.class, fbus.class});
        }
        if (ordinal == 3) {
            return new fbwv();
        }
        if (ordinal == 4) {
            return new fbwu();
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
        synchronized (fbwv.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

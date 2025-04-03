package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awya extends eyfy implements eyht {
    public static final awya a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    static {
        awya awyaVar = new awya();
        a = awyaVar;
        eyfy.registerDefaultInstance(awya.class, awyaVar);
    }

    private awya() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", awxy.a, "d", awxw.a, "e", "f"});
        }
        if (ordinal == 3) {
            return new awya();
        }
        if (ordinal == 4) {
            return new awxv();
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
        synchronized (awya.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

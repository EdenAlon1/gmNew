package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aevu extends eyfy implements eyht {
    public static final aevu a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public eyja e;

    static {
        aevu aevuVar = new aevu();
        a = aevuVar;
        eyfy.registerDefaultInstance(aevu.class, aevuVar);
    }

    private aevu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new aevu();
        }
        if (ordinal == 4) {
            return new aevt();
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
        synchronized (aevu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

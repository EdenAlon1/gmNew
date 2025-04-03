package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evzd extends eyfy implements eyht {
    public static final evzd a;
    private static volatile eyhz i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;
    public int g;
    public int h;

    static {
        evzd evzdVar = new evzd();
        a = evzdVar;
        eyfy.registerDefaultInstance(evzd.class, evzdVar);
    }

    private evzd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\n\u0001\u0001\u0002\u000b\n\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0003\b᠌\u0001\tဇ\u0002\n᠌\u0004\u000b<\u0000", new Object[]{"d", "c", "b", evxu.class, evzr.class, evvz.class, ewab.class, evyu.class, "g", evyz.a, "e", evzb.a, "f", "h", evyw.a, evxw.class});
        }
        if (ordinal == 3) {
            return new evzd();
        }
        if (ordinal == 4) {
            return new evyv();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evzd.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezvl extends eyfy implements eyht {
    public static final ezvl a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public eydi e;
    public boolean f;

    static {
        ezvl ezvlVar = new ezvl();
        a = ezvlVar;
        eyfy.registerDefaultInstance(ezvl.class, ezvlVar);
    }

    private ezvl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002:\u0000\u0003ဉ\u0000\u0004ဇ\u0001", new Object[]{"d", "c", "b", ezvx.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new ezvl();
        }
        if (ordinal == 4) {
            return new ezvk();
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
        synchronized (ezvl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

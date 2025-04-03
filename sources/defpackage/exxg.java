package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exxg extends eyfy implements eyht {
    public static final exxg a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        exxg exxgVar = new exxg();
        a = exxgVar;
        eyfy.registerDefaultInstance(exxg.class, exxgVar);
    }

    private exxg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003င\u0000\u0004င\u0001", new Object[]{"d", "c", "b", exwv.class, exzj.class, "e", "f"});
        }
        if (ordinal == 3) {
            return new exxg();
        }
        if (ordinal == 4) {
            return new exxf();
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
        synchronized (exxg.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgg extends eyfy implements eyht {
    public static final dlgg a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    static {
        dlgg dlggVar = new dlgg();
        a = dlggVar;
        eyfy.registerDefaultInstance(dlgg.class, dlggVar);
    }

    private dlgg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", dlgl.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new dlgg();
        }
        if (ordinal == 4) {
            return new dlgf();
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
        synchronized (dlgg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

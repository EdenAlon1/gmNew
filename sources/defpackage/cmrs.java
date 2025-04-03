package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmrs extends eyfy implements eyht {
    public static final cmrs a;
    private static volatile eyhz g;
    public int b;
    public cmri c;
    public boolean d;
    public fjay e;
    public String f = "";

    static {
        cmrs cmrsVar = new cmrs();
        a = cmrsVar;
        eyfy.registerDefaultInstance(cmrs.class, cmrsVar);
    }

    private cmrs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ለ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cmrs();
        }
        if (ordinal == 4) {
            return new cmrr();
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
        synchronized (cmrs.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

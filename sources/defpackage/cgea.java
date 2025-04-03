package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgea extends eyfy implements eyht {
    public static final cgea a;
    private static volatile eyhz k;
    public int b;
    public boolean c;
    public long d;
    public boolean e;
    public boolean f;
    public eyja g;
    public boolean h;
    public boolean i;
    public int j;

    static {
        cgea cgeaVar = new cgea();
        a = cgeaVar;
        eyfy.registerDefaultInstance(cgea.class, cgeaVar);
    }

    private cgea() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဇ\u0006\tဇ\b\n᠌\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", cgdy.a});
        }
        if (ordinal == 3) {
            return new cgea();
        }
        if (ordinal == 4) {
            return new cgdx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cgea.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

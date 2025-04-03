package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpvt extends eyfy implements eyht {
    public static final cpvt a;
    private static volatile eyhz j;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        cpvt cpvtVar = new cpvt();
        a = cpvtVar;
        eyfy.registerDefaultInstance(cpvt.class, cpvtVar);
    }

    private cpvt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0000\u0000\u0001\u0007\u0002\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new cpvt();
        }
        if (ordinal == 4) {
            return new cpvs();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cpvt.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvx extends eyfy implements eyht {
    public static final axvx a;
    private static volatile eyhz j;
    public int b;
    public int c;
    public axvw d;
    public eyja e;
    public eyja f;
    public boolean g;
    public eyja h;
    public eyja i;

    static {
        axvx axvxVar = new axvx();
        a = axvxVar;
        eyfy.registerDefaultInstance(axvx.class, axvxVar);
    }

    private axvx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဇ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (ordinal == 3) {
            return new axvx();
        }
        if (ordinal == 4) {
            return new axvt();
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
        synchronized (axvx.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

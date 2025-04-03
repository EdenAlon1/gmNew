package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgkf extends eyfy implements eyht {
    public static final fgkf a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        fgkf fgkfVar = new fgkf();
        a = fgkfVar;
        eyfy.registerDefaultInstance(fgkf.class, fgkfVar);
    }

    private fgkf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005?\u0000", new Object[]{"c", "b", ezoa.class, ezoc.class});
        }
        if (ordinal == 3) {
            return new fgkf();
        }
        if (ordinal == 4) {
            return new fgke();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fgkf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

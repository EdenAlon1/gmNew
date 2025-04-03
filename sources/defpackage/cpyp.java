package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpyp extends eyfy implements eyht {
    public static final cpyp a;
    private static volatile eyhz k;
    public int b;
    public eyja c;
    public eyja d;
    public eyja e;
    public int f;
    public int g;
    public int h;
    public eyee i = eyee.b;
    public eyee j = eyee.b;

    static {
        cpyp cpypVar = new cpyp();
        a = cpypVar;
        eyfy.registerDefaultInstance(cpyp.class, cpypVar);
    }

    private cpyp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005\u0004\u0006\u0004\u0007\n\b\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new cpyp();
        }
        if (ordinal == 4) {
            return new cpyo();
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
        synchronized (cpyp.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

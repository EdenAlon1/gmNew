package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fauq extends eyfy implements eyht {
    public static final fauq a;
    private static volatile eyhz k;
    public int b = 0;
    public Object c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        fauq fauqVar = new fauq();
        a = fauqVar;
        eyfy.registerDefaultInstance(fauq.class, fauqVar);
    }

    private fauq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", "j", eyev.class, favc.class});
        }
        if (ordinal == 3) {
            return new fauq();
        }
        if (ordinal == 4) {
            return new fauo();
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
        synchronized (fauq.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

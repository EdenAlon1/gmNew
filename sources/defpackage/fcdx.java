package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcdx extends eyfy implements eyht {
    public static final fcdx a;
    private static volatile eyhz f;
    public int b;
    public fcdz c;
    public fcdz d;
    public int e;

    static {
        fcdx fcdxVar = new fcdx();
        a = fcdxVar;
        eyfy.registerDefaultInstance(fcdx.class, fcdxVar);
    }

    private fcdx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fcdx();
        }
        if (ordinal == 4) {
            return new fcdv();
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
        synchronized (fcdx.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnl extends eyfy implements eyht {
    public static final fbnl a;
    private static volatile eyhz c;
    public int b;

    static {
        fbnl fbnlVar = new fbnl();
        a = fbnlVar;
        eyfy.registerDefaultInstance(fbnl.class, fbnlVar);
    }

    private fbnl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new fbnl();
        }
        if (ordinal == 4) {
            return new fbnk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fbnl.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fata extends eyfy implements eyht {
    public static final fata a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public eyhm e = eyhm.a;

    static {
        fata fataVar = new fata();
        a = fataVar;
        eyfy.registerDefaultInstance(fata.class, fataVar);
    }

    private fata() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\f\u0002\f\u0003\f\u00042", new Object[]{"b", "c", "d", "e", fasz.a});
        }
        if (ordinal == 3) {
            return new fata();
        }
        if (ordinal == 4) {
            return new fasy();
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
        synchronized (fata.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

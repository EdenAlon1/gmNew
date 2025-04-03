package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faty extends eyfy implements eyht {
    public static final faty a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        faty fatyVar = new faty();
        a = fatyVar;
        eyfy.registerDefaultInstance(faty.class, fatyVar);
    }

    private faty() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new faty();
        }
        if (ordinal == 4) {
            return new fatx();
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
        synchronized (faty.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

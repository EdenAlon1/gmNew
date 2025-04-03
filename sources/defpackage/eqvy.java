package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvy extends eyfy implements eyht {
    public static final eqvy a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eqvy eqvyVar = new eqvy();
        a = eqvyVar;
        eyfy.registerDefaultInstance(eqvy.class, eqvyVar);
    }

    private eqvy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0004\u0005\u0002\u0000\u0000\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", eqvs.class, eqvu.class});
        }
        if (ordinal == 3) {
            return new eqvy();
        }
        if (ordinal == 4) {
            return new eqvw();
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
        synchronized (eqvy.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

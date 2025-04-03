package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgql extends eyfy implements eyht {
    public static final dgql a;
    private static volatile eyhz c;
    public eyhm b = eyhm.a;

    static {
        dgql dgqlVar = new dgql();
        a = dgqlVar;
        eyfy.registerDefaultInstance(dgql.class, dgqlVar);
    }

    private dgql() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dgqj.a});
        }
        if (ordinal == 3) {
            return new dgql();
        }
        if (ordinal == 4) {
            return new dgqk();
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
        synchronized (dgql.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

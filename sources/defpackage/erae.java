package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erae extends eyfy implements eyht {
    public static final erae a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public erah d;
    public eqsb e;
    public erak f;

    static {
        erae eraeVar = new erae();
        a = eraeVar;
        eyfy.registerDefaultInstance(erae.class, eraeVar);
    }

    private erae() {
        emptyIntList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0000\u0001ဌ\u0000\bဉ\u0006\tဉ\u0007\nဉ\b", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new erae();
        }
        if (ordinal == 4) {
            return new erad();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (erae.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

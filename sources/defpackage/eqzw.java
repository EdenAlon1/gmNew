package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqzw extends eyfy implements eyht {
    public static final eqzw a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eqzw eqzwVar = new eqzw();
        a = eqzwVar;
        eyfy.registerDefaultInstance(eqzw.class, eqzwVar);
    }

    private eqzw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0001\u0000de\u0002\u0000\u0000\u0000d<\u0000e<\u0000", new Object[]{"c", "b", eqzv.class, eqzt.class});
        }
        if (ordinal == 3) {
            return new eqzw();
        }
        if (ordinal == 4) {
            return new eqzr();
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
        synchronized (eqzw.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

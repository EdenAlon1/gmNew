package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyrm extends eyfy implements eyht {
    public static final eyrm a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        eyrm eyrmVar = new eyrm();
        a = eyrmVar;
        eyfy.registerDefaultInstance(eyrm.class, eyrmVar);
    }

    private eyrm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new eyrm();
        }
        if (ordinal == 4) {
            return new eyrl();
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
        synchronized (eyrm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

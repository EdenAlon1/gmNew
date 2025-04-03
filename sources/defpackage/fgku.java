package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgku extends eyfy implements eyht {
    public static final fgku a;
    private static volatile eyhz c;
    public eygi b = emptyIntList();

    static {
        fgku fgkuVar = new fgku();
        a = fgkuVar;
        eyfy.registerDefaultInstance(fgku.class, fgkuVar);
    }

    private fgku() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"b", fgko.a});
        }
        if (ordinal == 3) {
            return new fgku();
        }
        if (ordinal == 4) {
            return new fgkt();
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
        synchronized (fgku.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

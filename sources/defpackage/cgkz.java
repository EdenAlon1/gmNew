package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgkz extends eyfy implements eyht {
    public static final cgkz a;
    private static volatile eyhz d;
    public long b;
    public boolean c;

    static {
        cgkz cgkzVar = new cgkz();
        a = cgkzVar;
        eyfy.registerDefaultInstance(cgkz.class, cgkzVar);
    }

    private cgkz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0002\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new cgkz();
        }
        if (ordinal == 4) {
            return new cgky();
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
        synchronized (cgkz.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

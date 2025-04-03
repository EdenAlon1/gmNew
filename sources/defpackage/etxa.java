package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxa extends eyfy implements eyht {
    public static final etxa a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        etxa etxaVar = new etxa();
        a = etxaVar;
        eyfy.registerDefaultInstance(etxa.class, etxaVar);
    }

    private etxa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new etxa();
        }
        if (ordinal == 4) {
            return new etwz();
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
        synchronized (etxa.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

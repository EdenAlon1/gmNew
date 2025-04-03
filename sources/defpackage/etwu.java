package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwu extends eyfy implements eyht {
    public static final etwu a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public etww d;
    public int e;

    static {
        etwu etwuVar = new etwu();
        a = etwuVar;
        eyfy.registerDefaultInstance(etwu.class, etwuVar);
    }

    private etwu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"b", "d", "e", "c"});
        }
        if (ordinal == 3) {
            return new etwu();
        }
        if (ordinal == 4) {
            return new etwt();
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
        synchronized (etwu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

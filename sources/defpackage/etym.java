package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etym extends eyfy implements eyht {
    public static final etym a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public eyee d = eyee.b;
    public etyo e;

    static {
        etym etymVar = new etym();
        a = etymVar;
        eyfy.registerDefaultInstance(etym.class, etymVar);
    }

    private etym() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new etym();
        }
        if (ordinal == 4) {
            return new etyl();
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
        synchronized (etym.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsi extends eyfy implements eyht {
    public static final rsi a;
    private static volatile eyhz f;
    public int b;
    public rrn c;
    public rrj d;
    public rrl e;

    static {
        rsi rsiVar = new rsi();
        a = rsiVar;
        eyfy.registerDefaultInstance(rsi.class, rsiVar);
    }

    private rsi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new rsi();
        }
        if (ordinal == 4) {
            return new rsh();
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
        synchronized (rsi.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

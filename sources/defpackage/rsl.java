package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsl extends eyfy implements eyht {
    public static final rsl a;
    private static volatile eyhz f;
    public int b;
    public rrz c;
    public rrp d;
    public rrr e;

    static {
        rsl rslVar = new rsl();
        a = rslVar;
        eyfy.registerDefaultInstance(rsl.class, rslVar);
    }

    private rsl() {
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
            return new rsl();
        }
        if (ordinal == 4) {
            return new rsk();
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
        synchronized (rsl.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

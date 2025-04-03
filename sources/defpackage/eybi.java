package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eybi extends eyfy implements eyht {
    public static final eybi a;
    private static volatile eyhz f;
    public int b;
    public boolean c;
    public eyaj d;
    public eybg e;

    static {
        eybi eybiVar = new eybi();
        a = eybiVar;
        eyfy.registerDefaultInstance(eybi.class, eybiVar);
    }

    private eybi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0003ဉ\u0003\u0004ဇ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (ordinal == 3) {
            return new eybi();
        }
        if (ordinal == 4) {
            return new eybh();
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
        synchronized (eybi.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

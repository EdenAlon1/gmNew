package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etwa extends eyfy implements eyht {
    public static final etwa a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public etwe d;
    public eyee e = eyee.b;

    static {
        etwa etwaVar = new etwa();
        a = etwaVar;
        eyfy.registerDefaultInstance(etwa.class, etwaVar);
    }

    private etwa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new etwa();
        }
        if (ordinal == 4) {
            return new etvz();
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
        synchronized (etwa.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

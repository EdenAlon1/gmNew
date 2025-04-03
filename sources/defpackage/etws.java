package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etws extends eyfy implements eyht {
    public static final etws a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public etww d;
    public eyee e = eyee.b;

    static {
        etws etwsVar = new etws();
        a = etwsVar;
        eyfy.registerDefaultInstance(etws.class, etwsVar);
    }

    private etws() {
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
            return new etws();
        }
        if (ordinal == 4) {
            return new etwr();
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
        synchronized (etws.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

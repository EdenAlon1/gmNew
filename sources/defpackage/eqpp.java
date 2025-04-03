package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqpp extends eyfy implements eyht {
    public static final eqpp a;
    private static volatile eyhz e;
    public int b;
    public eyee c = eyee.b;
    public int d;

    static {
        eqpp eqppVar = new eqpp();
        a = eqppVar;
        eyfy.registerDefaultInstance(eqpp.class, eqppVar);
    }

    private eqpp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eqpp();
        }
        if (ordinal == 4) {
            return new eqpo();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqpp.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

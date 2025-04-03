package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyvt extends eyfy implements eyht {
    public static final eyvt a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public eyur d;
    public eyun e;

    static {
        eyvt eyvtVar = new eyvt();
        a = eyvtVar;
        eyfy.registerDefaultInstance(eyvt.class, eyvtVar);
    }

    private eyvt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", eyvs.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new eyvt();
        }
        if (ordinal == 4) {
            return new eyvr();
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
        synchronized (eyvt.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doza extends eyfy implements eyht {
    public static final doza a;
    private static volatile eyhz f;
    public int b;
    public int d;
    public String c = "";
    public eyee e = eyee.b;

    static {
        doza dozaVar = new doza();
        a = dozaVar;
        eyfy.registerDefaultInstance(doza.class, dozaVar);
    }

    private doza() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new doza();
        }
        if (ordinal == 4) {
            return new doyz();
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
        synchronized (doza.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

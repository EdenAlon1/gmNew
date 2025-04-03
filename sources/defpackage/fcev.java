package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcev extends eyfy implements eyht {
    public static final fcev a;
    private static volatile eyhz e;
    public int b;
    public eyee c = eyee.b;
    public eyee d = eyee.b;

    static {
        fcev fcevVar = new fcev();
        a = fcevVar;
        eyfy.registerDefaultInstance(fcev.class, fcevVar);
    }

    private fcev() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\n", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fcev();
        }
        if (ordinal == 4) {
            return new fceu();
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
        synchronized (fcev.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

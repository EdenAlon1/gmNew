package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzh extends eyfy implements eyht {
    public static final euzh a;
    private static volatile eyhz e;
    public int b;
    public int c = 1;
    public int d;

    static {
        euzh euzhVar = new euzh();
        a = euzhVar;
        eyfy.registerDefaultInstance(euzh.class, euzhVar);
    }

    private euzh() {
        eyfy.emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0002\u0007\u0002\u0000\u0000\u0000\u0002᠌\u0001\u0007င\u0002", new Object[]{"b", "c", euzi.a, "d"});
        }
        if (ordinal == 3) {
            return new euzh();
        }
        if (ordinal == 4) {
            return new euzg();
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
        synchronized (euzh.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

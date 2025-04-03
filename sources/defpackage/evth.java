package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evth extends eyfy implements eyht {
    public static final evth a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public evsw d;
    public evte e;

    static {
        evth evthVar = new evth();
        a = evthVar;
        eyfy.registerDefaultInstance(evth.class, evthVar);
    }

    private evth() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new evth();
        }
        if (ordinal == 4) {
            return new evtg();
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
        synchronized (evth.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

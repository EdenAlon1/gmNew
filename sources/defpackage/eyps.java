package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyps extends eyfy implements eyht {
    public static final eyps a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public eygr d = emptyProtobufList();

    static {
        eyps eypsVar = new eyps();
        a = eypsVar;
        eyfy.registerDefaultInstance(eyps.class, eypsVar);
    }

    private eyps() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0003\u001c", new Object[]{"b", "c", eypr.a, "d"});
        }
        if (ordinal == 3) {
            return new eyps();
        }
        if (ordinal == 4) {
            return new eypq();
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
        synchronized (eyps.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

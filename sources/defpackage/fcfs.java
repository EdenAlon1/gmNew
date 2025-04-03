package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcfs extends eyfy implements eyht {
    public static final fcfs a;
    private static volatile eyhz e;
    public eyee b = eyee.b;
    public int c;
    public eyee d;

    static {
        fcfs fcfsVar = new fcfs();
        a = fcfsVar;
        eyfy.registerDefaultInstance(fcfs.class, fcfsVar);
    }

    private fcfs() {
        emptyProtobufList();
        this.d = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\b\u0003\u0000\u0000\u0000\u0001\n\u0003\f\b\n", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fcfs();
        }
        if (ordinal == 4) {
            return new fcfr();
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
        synchronized (fcfs.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcch extends eyfy implements eyht {
    public static final fcch a;
    private static volatile eyhz e;
    public int b;
    public fcfo c;
    public eygr d = emptyProtobufList();

    static {
        fcch fcchVar = new fcch();
        a = fcchVar;
        eyfy.registerDefaultInstance(fcch.class, fcchVar);
    }

    private fcch() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"b", "c", "d", fccl.class});
        }
        if (ordinal == 3) {
            return new fcch();
        }
        if (ordinal == 4) {
            return new fccg();
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
        synchronized (fcch.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

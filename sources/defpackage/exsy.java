package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exsy extends eyfy implements eyht {
    public static final exsy a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        exsy exsyVar = new exsy();
        a = exsyVar;
        eyfy.registerDefaultInstance(exsy.class, exsyVar);
    }

    private exsy() {
        emptyProtobufList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\"\u0002\u0000\u0000\u0000\u0001᠌\u0000\"᠌\u0006", new Object[]{"b", "c", exsx.a, "d", exra.a});
        }
        if (ordinal == 3) {
            return new exsy();
        }
        if (ordinal == 4) {
            return new exsw();
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
        synchronized (exsy.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

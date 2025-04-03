package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exxy extends eyfy implements eyht {
    public static final exxy a;
    private static volatile eyhz c;
    public long b;
    private int d;

    static {
        exxy exxyVar = new exxy();
        a = exxyVar;
        eyfy.registerDefaultInstance(exxy.class, exxyVar);
    }

    private exxy() {
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
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0001", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new exxy();
        }
        if (ordinal == 4) {
            return new exxx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exxy.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

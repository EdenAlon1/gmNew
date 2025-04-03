package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpoy extends eyfy implements eyht {
    public static final cpoy a;
    private static volatile eyhz d;
    public awui b;
    public eygr c = emptyProtobufList();
    private int e;

    static {
        cpoy cpoyVar = new cpoy();
        a = cpoyVar;
        eyfy.registerDefaultInstance(cpoy.class, cpoyVar);
    }

    private cpoy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", fcek.class});
        }
        if (ordinal == 3) {
            return new cpoy();
        }
        if (ordinal == 4) {
            return new cpox();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cpoy.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

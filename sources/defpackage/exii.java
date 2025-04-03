package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exii extends eyfy implements eyht {
    public static final exii a;
    private static volatile eyhz f;
    public int d;
    public eygr b = emptyProtobufList();
    public eygr c = eyfy.emptyProtobufList();
    public eygr e = emptyProtobufList();

    static {
        exii exiiVar = new exii();
        a = exiiVar;
        eyfy.registerDefaultInstance(exii.class, exiiVar);
    }

    private exii() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0003\u0000\u0002\u001b\u0003Ț\u0004\f\u0005\u001b", new Object[]{"b", exie.class, "c", "d", "e", exih.class});
        }
        if (ordinal == 3) {
            return new exii();
        }
        if (ordinal == 4) {
            return new exia();
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
        synchronized (exii.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exvt extends eyfy implements eyht {
    public static final exvt a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        exvt exvtVar = new exvt();
        a = exvtVar;
        eyfy.registerDefaultInstance(exvt.class, exvtVar);
    }

    private exvt() {
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
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0002\u083f\u0000\u0004ဈ\u0000", new Object[]{"d", "c", "b", exvr.class, extw.a, "e"});
        }
        if (ordinal == 3) {
            return new exvt();
        }
        if (ordinal == 4) {
            return new exvs();
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
        synchronized (exvt.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

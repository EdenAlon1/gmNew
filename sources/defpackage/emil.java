package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emil extends eyfy implements eyht {
    public static final emil a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        emil emilVar = new emil();
        a = emilVar;
        eyfy.registerDefaultInstance(emil.class, emilVar);
    }

    private emil() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"f", "b", sen.a, "c", "d"});
        }
        if (ordinal == 3) {
            return new emil();
        }
        if (ordinal == 4) {
            return new emik();
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
        synchronized (emil.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

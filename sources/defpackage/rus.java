package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rus extends eyfy implements eyht {
    public static final rus a;
    private static volatile eyhz f;
    public String b = "";
    public String c = "";
    public int d;
    public ruu e;
    private int g;

    static {
        rus rusVar = new rus();
        a = rusVar;
        eyfy.registerDefaultInstance(rus.class, rusVar);
    }

    private rus() {
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
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"g", "b", "c", "d", ruq.a, "e"});
        }
        if (ordinal == 3) {
            return new rus();
        }
        if (ordinal == 4) {
            return new rup();
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
        synchronized (rus.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

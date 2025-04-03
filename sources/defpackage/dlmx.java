package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlmx extends eyfy implements eyht {
    public static final dlmx a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public String d = "";
    public dlmz e;

    static {
        dlmx dlmxVar = new dlmx();
        a = dlmxVar;
        eyfy.registerDefaultInstance(dlmx.class, dlmxVar);
    }

    private dlmx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new dlmx();
        }
        if (ordinal == 4) {
            return new dlmw();
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
        synchronized (dlmx.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

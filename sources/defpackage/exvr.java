package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exvr extends eyfy implements eyht {
    public static final exvr a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public extr d;
    public String e = "";

    static {
        exvr exvrVar = new exvr();
        a = exvrVar;
        eyfy.registerDefaultInstance(exvr.class, exvrVar);
    }

    private exvr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", extl.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new exvr();
        }
        if (ordinal == 4) {
            return new exvq();
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
        synchronized (exvr.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

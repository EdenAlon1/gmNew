package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exfu extends eyfy implements eyht {
    public static final exfu a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public exgi e;
    public String f = "";

    static {
        exfu exfuVar = new exfu();
        a = exfuVar;
        eyfy.registerDefaultInstance(exfu.class, exfuVar);
    }

    private exfu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", exqb.a, "d", fapk.a, "e", "f"});
        }
        if (ordinal == 3) {
            return new exfu();
        }
        if (ordinal == 4) {
            return new exft();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exfu.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

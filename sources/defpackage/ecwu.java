package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecwu extends eyfy implements eyht {
    public static final ecwu a;
    private static volatile eyhz f;
    public int b;
    public ecwt d;
    public String c = "";
    public String e = "";

    static {
        ecwu ecwuVar = new ecwu();
        a = ecwuVar;
        eyfy.registerDefaultInstance(ecwu.class, ecwuVar);
    }

    private ecwu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new ecwu();
        }
        if (ordinal == 4) {
            return new ecwp();
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
        synchronized (ecwu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

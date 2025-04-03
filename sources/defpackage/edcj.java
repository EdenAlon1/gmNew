package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edcj extends eyfy implements eyht {
    public static final edcj a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        edcj edcjVar = new edcj();
        a = edcjVar;
        eyfy.registerDefaultInstance(edcj.class, edcjVar);
    }

    private edcj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new edcj();
        }
        if (ordinal == 4) {
            return new edci();
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
        synchronized (edcj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwsa extends eyfy implements eyht {
    public static final dwsa a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        dwsa dwsaVar = new dwsa();
        a = dwsaVar;
        eyfy.registerDefaultInstance(dwsa.class, dwsaVar);
    }

    private dwsa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new dwsa();
        }
        if (ordinal == 4) {
            return new dwrz();
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
        synchronized (dwsa.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

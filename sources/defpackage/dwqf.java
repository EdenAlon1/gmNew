package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwqf extends eyfy implements eyht {
    public static final dwqf a;
    private static volatile eyhz c;
    public String b = "";
    private int d;

    static {
        dwqf dwqfVar = new dwqf();
        a = dwqfVar;
        eyfy.registerDefaultInstance(dwqf.class, dwqfVar);
    }

    private dwqf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new dwqf();
        }
        if (ordinal == 4) {
            return new dwqe();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (dwqf.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwoz extends eyfy implements eyht {
    public static final dwoz a;
    private static volatile eyhz c;
    public String b = "";
    private int d;

    static {
        dwoz dwozVar = new dwoz();
        a = dwozVar;
        eyfy.registerDefaultInstance(dwoz.class, dwozVar);
    }

    private dwoz() {
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
            return new dwoz();
        }
        if (ordinal == 4) {
            return new dwoy();
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
        synchronized (dwoz.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

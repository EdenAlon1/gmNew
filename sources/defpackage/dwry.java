package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwry extends eyfy implements eyht {
    public static final dwry a;
    private static volatile eyhz c;
    public int b;
    private int d;

    static {
        dwry dwryVar = new dwry();
        a = dwryVar;
        eyfy.registerDefaultInstance(dwry.class, dwryVar);
    }

    private dwry() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", dwrw.a});
        }
        if (ordinal == 3) {
            return new dwry();
        }
        if (ordinal == 4) {
            return new dwrv();
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
        synchronized (dwry.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

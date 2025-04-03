package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlon extends eyfy implements eyht {
    public static final dlon a;
    private static volatile eyhz c;
    public int b;
    private int d;

    static {
        dlon dlonVar = new dlon();
        a = dlonVar;
        eyfy.registerDefaultInstance(dlon.class, dlonVar);
    }

    private dlon() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", dlny.a});
        }
        if (ordinal == 3) {
            return new dlon();
        }
        if (ordinal == 4) {
            return new dlom();
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
        synchronized (dlon.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvia extends eyfy implements eyht {
    public static final cvia a;
    private static volatile eyhz f;
    public eyja b;
    public String c = "";
    public int d;
    public int e;
    private int g;

    static {
        cvia cviaVar = new cvia();
        a = cviaVar;
        eyfy.registerDefaultInstance(cvia.class, cviaVar);
    }

    private cvia() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0004\u0004\f", new Object[]{"g", "c", "b", "d", "e"});
        }
        if (ordinal == 3) {
            return new cvia();
        }
        if (ordinal == 4) {
            return new cvhy();
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
        synchronized (cvia.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

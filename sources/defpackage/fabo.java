package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class fabo extends eyfy implements eyht {
    public static final fabo a;
    private static volatile eyhz h;
    public int b;
    public String c = "";
    public ezxt d;
    public ezyx e;
    public fabm f;
    public ezzn g;

    static {
        fabo faboVar = new fabo();
        a = faboVar;
        eyfy.registerDefaultInstance(fabo.class, faboVar);
    }

    private fabo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new fabo();
        }
        if (ordinal == 4) {
            return new fabn();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fabo.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

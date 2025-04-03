package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgow extends eyfy implements eyht {
    public static final fgow a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public long d;
    public eygl e;

    static {
        fgow fgowVar = new fgow();
        a = fgowVar;
        eyfy.registerDefaultInstance(fgow.class, fgowVar);
    }

    private fgow() {
        emptyLongList();
        this.e = emptyLongList();
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0004\u0015", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fgow();
        }
        if (ordinal == 4) {
            return new fgov();
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
        synchronized (fgow.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyk extends eyfy implements eyht {
    public static final deyk a;
    private static volatile eyhz e;
    public int b;
    public deyi c;
    public String d = "";
    private int f;

    static {
        deyk deykVar = new deyk();
        a = deykVar;
        eyfy.registerDefaultInstance(deyk.class, deykVar);
    }

    private deyk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0004Ȉ", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new deyk();
        }
        if (ordinal == 4) {
            return new deyj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (deyk.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esgj extends eyfy implements eyht {
    public static final esgj a;
    private static volatile eyhz e;
    public String b = "";
    public int c;
    public int d;

    static {
        esgj esgjVar = new esgj();
        a = esgjVar;
        eyfy.registerDefaultInstance(esgj.class, esgjVar);
    }

    private esgj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new esgj();
        }
        if (ordinal == 4) {
            return new esgi();
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
        synchronized (esgj.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

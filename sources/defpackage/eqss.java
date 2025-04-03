package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqss extends eyfy implements eyht {
    public static final eqss a;
    private static volatile eyhz s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public boolean n;
    public int o;
    public boolean p;
    public eygi i = emptyIntList();
    public eygi j = emptyIntList();
    public eygi k = emptyIntList();
    public eygc l = emptyBooleanList();
    public eygc m = emptyBooleanList();
    public eygi q = emptyIntList();
    public eygi r = emptyIntList();

    static {
        eqss eqssVar = new eqss();
        a = eqssVar;
        eyfy.registerDefaultInstance(eqss.class, eqssVar);
    }

    private eqss() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eqtf.a;
            return newMessageInfo(a, "\u0004\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0007\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007'\b'\t*\n*\u000bဇ\u0006\f᠌\u0007\rဇ\b\u000eࠬ\u000f'\u0010ࠬ", new Object[]{"b", "c", "d", "e", "f", "g", "h", eyggVar, "i", "k", "l", "m", "n", "o", eqsr.a, "p", "q", eqsm.a, "r", "j", eyggVar});
        }
        if (ordinal == 3) {
            return new eqss();
        }
        if (ordinal == 4) {
            return new eqsq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = s;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqss.class) {
            eyhzVar = s;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                s = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

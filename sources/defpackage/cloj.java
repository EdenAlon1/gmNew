package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cloj extends eyfy implements eyht {
    public static final eygj a = new cloh();
    public static final cloj b;
    private static volatile eyhz j;
    public int c;
    public clqx d;
    public clqv e;
    public clqv f;
    public clon g;
    public eyja h;
    public eygi i = emptyIntList();

    static {
        cloj clojVar = new cloj();
        b = clojVar;
        eyfy.registerDefaultInstance(cloj.class, clojVar);
    }

    private cloj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\bࠬ", new Object[]{"c", "d", "e", "f", "g", "h", "i", clob.a});
        }
        if (ordinal == 3) {
            return new cloj();
        }
        if (ordinal == 4) {
            return new cloi();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cloj.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

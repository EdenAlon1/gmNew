package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyld extends eyfy implements eyht {
    public static final eyld a;
    private static volatile eyhz f;
    public eygl b = emptyLongList();
    public eykp c;
    public eykp d;
    public int e;
    private int g;

    static {
        eyld eyldVar = new eyld();
        a = eyldVar;
        eyfy.registerDefaultInstance(eyld.class, eyldVar);
    }

    private eyld() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001%\u0002ဉ\u0000\u0003ဉ\u0001\u0004\f", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eyld();
        }
        if (ordinal == 4) {
            return new eylc();
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
        synchronized (eyld.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

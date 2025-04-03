package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fahw extends eyfy implements eyht {
    public static final eygj a = new fahr();
    public static final fahw b;
    private static volatile eyhz g;
    public int c;
    public fahu d;
    public int e;
    public eygi f = emptyIntList();

    static {
        fahw fahwVar = new fahw();
        b = fahwVar;
        eyfy.registerDefaultInstance(fahw.class, fahwVar);
    }

    private fahw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0003\f\u0004,", new Object[]{"c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fahw();
        }
        if (ordinal == 4) {
            return new fahs();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fahw.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

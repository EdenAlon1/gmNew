package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eojd extends eyfy implements eyht {
    public static final eojd a;
    private static volatile eyhz h;
    public int b;
    public eost c;
    public eotb d;
    public eoue e;
    public eoqv f;
    public eolr g;

    static {
        eojd eojdVar = new eojd();
        a = eojdVar;
        eyfy.registerDefaultInstance(eojd.class, eojdVar);
    }

    private eojd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new eojd();
        }
        if (ordinal == 4) {
            return new eojc();
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
        synchronized (eojd.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emkd extends eyfy implements eyht {
    public static final eygj a = new emjp();
    public static final emkd b;
    private static volatile eyhz h;
    public int c;
    public Object e;
    public emkf g;
    public int d = 0;
    public eygi f = emptyIntList();

    static {
        emkd emkdVar = new emkd();
        b = emkdVar;
        eyfy.registerDefaultInstance(emkd.class, emkdVar);
    }

    private emkd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ࠞ\u0005ဉ\u0001", new Object[]{"e", "d", "c", emjs.class, emkc.class, "f", fbrh.a, "g"});
        }
        if (ordinal == 3) {
            return new emkd();
        }
        if (ordinal == 4) {
            return new emjq();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emkd.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

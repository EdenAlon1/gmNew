package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emkc extends eyfy implements eyht {
    public static final eygj a = new emju();
    public static final emkc b;
    private static volatile eyhz n;
    public int c;
    public emhv d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public eygi m = emptyIntList();

    static {
        emkc emkcVar = new emkc();
        b = emkcVar;
        eyfy.registerDefaultInstance(emkc.class, emkcVar);
    }

    private emkc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007င\u0006\b᠌\u0007\t᠌\b\nࠬ", new Object[]{"c", "d", "e", "f", emjy.a, "g", "h", "i", "j", "k", emka.a, "l", emjw.a, "m", fbrh.a});
        }
        if (ordinal == 3) {
            return new emkc();
        }
        if (ordinal == 4) {
            return new emjv();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = n;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (emkc.class) {
            eyhzVar = n;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                n = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjeh extends eyfy implements eyht {
    public static final cjeh a;
    private static volatile eyhz g;
    public int b;
    public double c;
    public double d;
    public float e;
    public eyja f;

    static {
        cjeh cjehVar = new cjeh();
        a = cjehVar;
        eyfy.registerDefaultInstance(cjeh.class, cjehVar);
    }

    private cjeh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ခ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cjeh();
        }
        if (ordinal == 4) {
            return new cjeg();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cjeh.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

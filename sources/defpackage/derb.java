package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class derb extends eyfy implements eyht {
    public static final derb a;
    private static volatile eyhz h;
    public Object c;
    public eyja d;
    public derl f;
    public int g;
    private int i;
    public int b = 0;
    public String e = "";

    static {
        derb derbVar = new derb();
        a = derbVar;
        eyfy.registerDefaultInstance(derb.class, derbVar);
    }

    private derb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002ဉ\u0000\u0003ለ\u0001\u0004ဉ\u0002\u0005<\u0000\u0006ဌ\u0003", new Object[]{"c", "b", "i", derf.class, "d", "e", "f", deqa.class, "g"});
        }
        if (ordinal == 3) {
            return new derb();
        }
        if (ordinal == 4) {
            return new deqz();
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
        synchronized (derb.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbl extends eyfy implements eyht {
    public static final ckbl a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public int c = 0;
    public eyee e = eyee.b;

    static {
        ckbl ckblVar = new ckbl();
        a = ckblVar;
        eyfy.registerDefaultInstance(ckbl.class, ckblVar);
    }

    private ckbl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0001\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005ည\u0000", new Object[]{"d", "c", "b", ckbt.class, ckbn.class, ckbv.class, "e"});
        }
        if (ordinal == 3) {
            return new ckbl();
        }
        if (ordinal == 4) {
            return new ckbk();
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
        synchronized (ckbl.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

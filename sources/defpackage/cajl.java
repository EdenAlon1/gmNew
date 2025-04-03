package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cajl extends eyfy implements eyht {
    public static final cajl a;
    private static volatile eyhz g;
    public int b;
    public long d;
    public int e;
    public String c = "";
    public eyee f = eyee.b;

    static {
        cajl cajlVar = new cajl();
        a = cajlVar;
        eyfy.registerDefaultInstance(cajl.class, cajlVar);
    }

    private cajl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\f\u0004ည\u0000", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cajl();
        }
        if (ordinal == 4) {
            return new cajk();
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
        synchronized (cajl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class derv extends eyfy implements eyht {
    public static final derv a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public eyee d = eyee.b;
    public int e;

    static {
        derv dervVar = new derv();
        a = dervVar;
        eyfy.registerDefaultInstance(derv.class, dervVar);
    }

    private derv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new derv();
        }
        if (ordinal == 4) {
            return new deru();
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
        synchronized (derv.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

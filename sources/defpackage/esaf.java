package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esaf extends eyfy implements eyht {
    public static final esaf a;
    private static volatile eyhz d;
    public int b;
    public boolean c;

    static {
        esaf esafVar = new esaf();
        a = esafVar;
        eyfy.registerDefaultInstance(esaf.class, esafVar);
    }

    private esaf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\f\u0003\u0007", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new esaf();
        }
        if (ordinal == 4) {
            return new esae();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esaf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

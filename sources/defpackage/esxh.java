package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esxh extends eyfy implements eyht {
    public static final esxh a;
    private static volatile eyhz d;
    public int b;
    public etau c;

    static {
        esxh esxhVar = new esxh();
        a = esxhVar;
        eyfy.registerDefaultInstance(esxh.class, esxhVar);
    }

    private esxh() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new esxh();
        }
        if (ordinal == 4) {
            return new esxg();
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
        synchronized (esxh.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

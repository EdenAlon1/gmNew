package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esxa extends eyfy implements eyht {
    public static final esxa a;
    private static volatile eyhz f;
    public int b;
    public etau c;
    public String d = "";
    public boolean e;

    static {
        esxa esxaVar = new esxa();
        a = esxaVar;
        eyfy.registerDefaultInstance(esxa.class, esxaVar);
    }

    private esxa() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001ϧ\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0007ϧဉ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (ordinal == 3) {
            return new esxa();
        }
        if (ordinal == 4) {
            return new eswz();
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
        synchronized (esxa.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

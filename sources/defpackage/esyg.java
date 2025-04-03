package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esyg extends eyfy implements eyht {
    public static final esyg a;
    private static volatile eyhz f;
    public int b;
    public etau c;
    public eygi d = emptyIntList();
    public int e;

    static {
        esyg esygVar = new esyg();
        a = esygVar;
        eyfy.registerDefaultInstance(esyg.class, esygVar);
    }

    private esyg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0002ϧ\u0003\u0000\u0001\u0000\u0002,\u0003\u0004ϧဉ\u0000", new Object[]{"b", "d", "e", "c"});
        }
        if (ordinal == 3) {
            return new esyg();
        }
        if (ordinal == 4) {
            return new esyf();
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
        synchronized (esyg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

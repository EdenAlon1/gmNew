package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esij extends eyfy implements eyht {
    public static final esij a;
    private static volatile eyhz d;
    public eyee b = eyee.b;
    public int c;

    static {
        esij esijVar = new esij();
        a = esijVar;
        eyfy.registerDefaultInstance(esij.class, esijVar);
    }

    private esij() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new esij();
        }
        if (ordinal == 4) {
            return new esii();
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
        synchronized (esij.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

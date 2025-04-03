package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evyn extends eyfy implements eyht {
    public static final evyn a;
    private static volatile eyhz f;
    public int b;
    public Object d;
    public int c = 0;
    public String e = "";

    static {
        evyn evynVar = new evyn();
        a = evynVar;
        eyfy.registerDefaultInstance(evyn.class, evynVar);
    }

    private evyn() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002;\u0000\u0003\u083f\u0000\u00047\u0000\u0005:\u0000", new Object[]{"d", "c", "b", "e", evyk.a});
        }
        if (ordinal == 3) {
            return new evyn();
        }
        if (ordinal == 4) {
            return new evyj();
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
        synchronized (evyn.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

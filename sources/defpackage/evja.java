package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evja extends eyfy implements eyht {
    public static final evja a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        evja evjaVar = new evja();
        a = evjaVar;
        eyfy.registerDefaultInstance(evja.class, evjaVar);
    }

    private evja() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006᠌\u0000", new Object[]{"b", "c", eviz.a});
        }
        if (ordinal == 3) {
            return new evja();
        }
        if (ordinal == 4) {
            return new eviy();
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
        synchronized (evja.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

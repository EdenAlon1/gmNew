package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evud extends eyfy implements eyht {
    public static final evud a;
    private static volatile eyhz d;
    public int b;
    public evun c;

    static {
        evud evudVar = new evud();
        a = evudVar;
        eyfy.registerDefaultInstance(evud.class, evudVar);
    }

    private evud() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new evud();
        }
        if (ordinal == 4) {
            return new evuc();
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
        synchronized (evud.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqbu extends eyfy implements eyht {
    public static final eqbu a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        eqbu eqbuVar = new eqbu();
        a = eqbuVar;
        eyfy.registerDefaultInstance(eqbu.class, eqbuVar);
    }

    private eqbu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", eqbr.a, "d", eqbs.a, "e", eqbt.a});
        }
        if (ordinal == 3) {
            return new eqbu();
        }
        if (ordinal == 4) {
            return new eqbq();
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
        synchronized (eqbu.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

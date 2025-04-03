package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyy extends eyfy implements eyht {
    public static final epyy a;
    private static volatile eyhz e;
    public int b;
    public eqad c;
    public epzq d;

    static {
        epyy epyyVar = new epyy();
        a = epyyVar;
        eyfy.registerDefaultInstance(epyy.class, epyyVar);
    }

    private epyy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new epyy();
        }
        if (ordinal == 4) {
            return new epyx();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epyy.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

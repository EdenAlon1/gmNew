package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzl extends eyfy implements eyht {
    public static final akzl a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        akzl akzlVar = new akzl();
        a = akzlVar;
        eyfy.registerDefaultInstance(akzl.class, akzlVar);
    }

    private akzl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u083f\u0000\u0002\u083f\u0000", new Object[]{"c", "b", eols.a, epyv.a});
        }
        if (ordinal == 3) {
            return new akzl();
        }
        if (ordinal == 4) {
            return new akzk();
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
        synchronized (akzl.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

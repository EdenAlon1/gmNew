package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqmi extends eyfy implements eyht {
    public static final eqmi a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";
    public long h;

    static {
        eqmi eqmiVar = new eqmi();
        a = eqmiVar;
        eyfy.registerDefaultInstance(eqmi.class, eqmiVar);
    }

    private eqmi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", eqmd.a, "d", eqmf.a, "e", eqme.a, "f", eqmg.a, "g", "h"});
        }
        if (ordinal == 3) {
            return new eqmi();
        }
        if (ordinal == 4) {
            return new eqmc();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqmi.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

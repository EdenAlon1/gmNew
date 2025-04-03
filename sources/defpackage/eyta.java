package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyta extends eyfy implements eyht {
    public static final eyta a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public int d;
    public int e;
    public int f;
    public int g;
    public eyqm h;

    static {
        eyta eytaVar = new eyta();
        a = eytaVar;
        eyfy.registerDefaultInstance(eyta.class, eytaVar);
    }

    private eyta() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0010\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0006᠌\u0004\u0007᠌\u0005\t᠌\u0007\n᠌\b\u0010ဉ\u000e", new Object[]{"b", "c", "d", ezey.a, "e", ezfb.a, "f", ezfa.a, "g", eqwe.a, "h"});
        }
        if (ordinal == 3) {
            return new eyta();
        }
        if (ordinal == 4) {
            return new eysz();
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
        synchronized (eyta.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwm extends eyfy implements eyht {
    public static final eqwm a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public int e;
    public eqpc f;

    static {
        eqwm eqwmVar = new eqwm();
        a = eqwmVar;
        eyfy.registerDefaultInstance(eqwm.class, eqwmVar);
    }

    private eqwm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eqwe.a;
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e", ezfb.a, "f"});
        }
        if (ordinal == 3) {
            return new eqwm();
        }
        if (ordinal == 4) {
            return new eqwl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqwm.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

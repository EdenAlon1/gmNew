package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqco extends eyfy implements eyht {
    public static final eqco a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public String d = "";

    static {
        eqco eqcoVar = new eqco();
        a = eqcoVar;
        eyfy.registerDefaultInstance(eqco.class, eqcoVar);
    }

    private eqco() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new eqco();
        }
        if (ordinal == 4) {
            return new eqcn();
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
        synchronized (eqco.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

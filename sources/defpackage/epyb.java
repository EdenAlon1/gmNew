package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyb extends eyfy implements eyht {
    public static final epyb a;
    private static volatile eyhz j;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public epyd f;
    public eqob g;
    public epyh h;
    public int i;

    static {
        epyb epybVar = new epyb();
        a = epybVar;
        eyfy.registerDefaultInstance(epyb.class, epybVar);
    }

    private epyb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006<\u0000\u0007\u083f\u0000\b\u083f\u0000", new Object[]{"d", "c", "b", "e", epxy.a, "f", "g", "h", "i", fata.class, epya.a, epxx.a});
        }
        if (ordinal == 3) {
            return new epyb();
        }
        if (ordinal == 4) {
            return new epxw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = j;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (epyb.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

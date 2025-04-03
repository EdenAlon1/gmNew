package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtq extends eyfy implements eyht {
    public static final rtq a;
    private static volatile eyhz e;
    public int b;
    public boolean c;
    public long d;

    static {
        rtq rtqVar = new rtq();
        a = rtqVar;
        eyfy.registerDefaultInstance(rtq.class, rtqVar);
    }

    private rtq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဃ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new rtq();
        }
        if (ordinal == 4) {
            return new rtp();
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
        synchronized (rtq.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

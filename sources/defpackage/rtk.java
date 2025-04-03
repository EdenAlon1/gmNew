package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtk extends eyfy implements eyht {
    public static final rtk a;
    private static volatile eyhz k;
    public int b;
    public rsy c;
    public rtc d;
    public rto e;
    public rtm f;
    public rss g;
    public rtg h;
    public rti i;
    public rte j;

    static {
        rtk rtkVar = new rtk();
        a = rtkVar;
        eyfy.registerDefaultInstance(rtk.class, rtkVar);
    }

    private rtk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (ordinal == 3) {
            return new rtk();
        }
        if (ordinal == 4) {
            return new rtj();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (rtk.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

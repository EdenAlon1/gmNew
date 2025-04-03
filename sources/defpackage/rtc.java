package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtc extends eyfy implements eyht {
    public static final rtc a;
    private static volatile eyhz j;
    public int b;
    public eyee c;
    public String d;
    public long e;
    public long f;
    public int g;
    public int h;
    public int i;

    static {
        rtc rtcVar = new rtc();
        a = rtcVar;
        eyfy.registerDefaultInstance(rtc.class, rtcVar);
    }

    private rtc() {
        eyee eyeeVar = eyee.b;
        this.c = eyee.b;
        this.d = "";
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = ruc.a;
            return newMessageInfo(a, "\u0004\u0007\u0000\u0001\u0006\r\u0007\u0000\u0000\u0000\u0006ဈ\u0007\u0007ည\u0004\tဂ\t\nဂ\n\u000b᠌\u000b\f᠌\f\r᠌\r", new Object[]{"b", "d", "c", "e", "f", "g", eyggVar, "h", eyggVar, "i", rub.a});
        }
        if (ordinal == 3) {
            return new rtc();
        }
        if (ordinal == 4) {
            return new rtb();
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
        synchronized (rtc.class) {
            eyhzVar = j;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                j = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

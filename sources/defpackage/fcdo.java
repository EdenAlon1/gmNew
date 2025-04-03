package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcdo extends eyfy implements eyht {
    public static final fcdo a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        fcdo fcdoVar = new fcdo();
        a = fcdoVar;
        eyfy.registerDefaultInstance(fcdo.class, fcdoVar);
    }

    private fcdo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u000f\u0001\u0000\u0001w\u000f\u0000\u0000\u0000\u0001\fg<\u0000j<\u0000k<\u0000l<\u0000n<\u0000o<\u0000p<\u0000q<\u0000r<\u0000s<\u0000t<\u0000u<\u0000v<\u0000w<\u0000", new Object[]{"c", "b", "d", fckq.class, fclm.class, fcku.class, fcko.class, fcma.class, fckk.class, fcly.class, fckm.class, fcmi.class, fclk.class, fcli.class, fclu.class, fcmg.class, fclo.class});
        }
        if (ordinal == 3) {
            return new fcdo();
        }
        if (ordinal == 4) {
            return new fcdn();
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
        synchronized (fcdo.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

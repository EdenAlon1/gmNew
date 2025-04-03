package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtm extends eyfy implements eyht {
    public static final rtm a;
    private static volatile eyhz h;
    public int b;
    public int c;
    public long d;
    public rsq e;
    public int f;
    public int g;

    static {
        rtm rtmVar = new rtm();
        a = rtmVar;
        eyfy.registerDefaultInstance(rtm.class, rtmVar);
    }

    private rtm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဃ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", ruh.a, "d", "e", "f", ruj.a, "g", rtz.a});
        }
        if (ordinal == 3) {
            return new rtm();
        }
        if (ordinal == 4) {
            return new rtl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = h;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (rtm.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

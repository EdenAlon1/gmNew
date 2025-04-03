package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awup extends eyfy implements eyht {
    public static final awup a;
    private static volatile eyhz f;
    public int b;
    public eyhm e = eyhm.a;
    public String c = "";
    public String d = "";

    static {
        awup awupVar = new awup();
        a = awupVar;
        eyfy.registerDefaultInstance(awup.class, awupVar);
    }

    private awup() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u00032", new Object[]{"b", "c", "d", "e", awuo.a});
        }
        if (ordinal == 3) {
            return new awup();
        }
        if (ordinal == 4) {
            return new awun();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (awup.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

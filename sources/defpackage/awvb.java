package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awvb extends eyfy implements eyht {
    public static final awvb a;
    private static volatile eyhz h;
    public int b;
    public int d;
    public awup e;
    public eyja g;
    public String c = "";
    public String f = "";

    static {
        awvb awvbVar = new awvb();
        a = awvbVar;
        eyfy.registerDefaultInstance(awvb.class, awvbVar);
    }

    private awvb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (ordinal == 3) {
            return new awvb();
        }
        if (ordinal == 4) {
            return new awva();
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
        synchronized (awvb.class) {
            eyhzVar = h;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                h = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

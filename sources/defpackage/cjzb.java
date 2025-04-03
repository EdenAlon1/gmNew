package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjzb extends eyfy implements eyht {
    public static final cjzb a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public eyja e;

    static {
        cjzb cjzbVar = new cjzb();
        a = cjzbVar;
        eyfy.registerDefaultInstance(cjzb.class, cjzbVar);
    }

    private cjzb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new cjzb();
        }
        if (ordinal == 4) {
            return new cjza();
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
        synchronized (cjzb.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

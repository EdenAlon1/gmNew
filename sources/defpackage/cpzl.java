package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpzl extends eyfy implements eyht {
    public static final cpzl a;
    private static volatile eyhz g;
    public int b;
    public eyee c = eyee.b;
    public String d = "";
    public eyja e;
    public eyja f;

    static {
        cpzl cpzlVar = new cpzl();
        a = cpzlVar;
        eyfy.registerDefaultInstance(cpzl.class, cpzlVar);
    }

    private cpzl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cpzl();
        }
        if (ordinal == 4) {
            return new cpzk();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cpzl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

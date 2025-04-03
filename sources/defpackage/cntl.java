package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cntl extends eyfy implements eyht {
    public static final cntl a;
    private static volatile eyhz g;
    public int b;
    public int c = 0;
    public Object d;
    public cnso e;
    public eyja f;

    static {
        cntl cntlVar = new cntl();
        a = cntlVar;
        eyfy.registerDefaultInstance(cntl.class, cntlVar);
    }

    private cntl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003ဉ\u0001", new Object[]{"d", "c", "b", "e", cnsr.class, "f"});
        }
        if (ordinal == 3) {
            return new cntl();
        }
        if (ordinal == 4) {
            return new cntk();
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
        synchronized (cntl.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

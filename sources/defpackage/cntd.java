package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cntd extends eyfy implements eyht {
    public static final cntd a;
    private static volatile eyhz g;
    public int b;
    public cnso c;
    public cnsz d;
    public eyja e;
    public int f;

    static {
        cntd cntdVar = new cntd();
        a = cntdVar;
        eyfy.registerDefaultInstance(cntd.class, cntdVar);
    }

    private cntd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဌ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new cntd();
        }
        if (ordinal == 4) {
            return new cntc();
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
        synchronized (cntd.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

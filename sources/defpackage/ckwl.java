package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwl extends eyfy implements eyht {
    public static final ckwl a;
    private static volatile eyhz e;
    public int b;
    public eyja c;
    public eyhm d = eyhm.a;

    static {
        ckwl ckwlVar = new ckwl();
        a = ckwlVar;
        eyfy.registerDefaultInstance(ckwl.class, ckwlVar);
    }

    private ckwl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"b", "c", "d", ckwk.a});
        }
        if (ordinal == 3) {
            return new ckwl();
        }
        if (ordinal == 4) {
            return new ckwj();
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
        synchronized (ckwl.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

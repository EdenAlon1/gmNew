package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxx extends eyfy implements eyht {
    public static final ckxx a;
    private static volatile eyhz e;
    public int b;
    public eyja c;
    public String d = "";

    static {
        ckxx ckxxVar = new ckxx();
        a = ckxxVar;
        eyfy.registerDefaultInstance(ckxx.class, ckxxVar);
    }

    private ckxx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ckxx();
        }
        if (ordinal == 4) {
            return new ckxw();
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
        synchronized (ckxx.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

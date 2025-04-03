package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exvx extends eyfy implements eyht {
    public static final exvx a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        exvx exvxVar = new exvx();
        a = exvxVar;
        eyfy.registerDefaultInstance(exvx.class, exvxVar);
    }

    private exvx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", exua.class, exwg.class, extp.class, exwe.class, exty.class, exuc.class});
        }
        if (ordinal == 3) {
            return new exvx();
        }
        if (ordinal == 4) {
            return new exvw();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exvx.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

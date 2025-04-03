package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezyo extends eyfy implements eyht {
    public static final ezyo a;
    private static volatile eyhz e;
    public int b = 0;
    public Object c;
    public int d;

    static {
        ezyo ezyoVar = new ezyo();
        a = ezyoVar;
        eyfy.registerDefaultInstance(ezyo.class, ezyoVar);
    }

    private ezyo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", ezyn.class, ezyf.class, ezyj.class, ezyh.class});
        }
        if (ordinal == 3) {
            return new ezyo();
        }
        if (ordinal == 4) {
            return new ezyd();
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
        synchronized (ezyo.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

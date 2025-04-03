package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezyv extends eyfy implements eyht {
    public static final ezyv a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public eyev e;

    static {
        ezyv ezyvVar = new ezyv();
        a = ezyvVar;
        eyfy.registerDefaultInstance(ezyv.class, ezyvVar);
    }

    private ezyv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", ezyu.class, ezyq.class, ezyc.class, ezyo.class, ezys.class});
        }
        if (ordinal == 3) {
            return new ezyv();
        }
        if (ordinal == 4) {
            return new ezya();
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
        synchronized (ezyv.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

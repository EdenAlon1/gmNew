package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvfi extends eyfy implements eyht {
    public static final dvfi a;
    private static volatile eyhz e;
    public int b;
    public ewan c;
    public int d;

    static {
        dvfi dvfiVar = new dvfi();
        a = dvfiVar;
        eyfy.registerDefaultInstance(dvfi.class, dvfiVar);
    }

    private dvfi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new dvfi();
        }
        if (ordinal == 4) {
            return new dvfh();
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
        synchronized (dvfi.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

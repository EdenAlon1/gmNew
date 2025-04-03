package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbg extends eyfy implements eyht {
    public static final dvbg a;
    public static final eyfw b;
    private static volatile eyhz e;
    public int c = 0;
    public Object d;

    static {
        dvbg dvbgVar = new dvbg();
        a = dvbgVar;
        eyfy.registerDefaultInstance(dvbg.class, dvbgVar);
        b = eyfy.newSingularGeneratedExtension(dvau.a, dvbgVar, dvbgVar, null, 9003, eyjr.MESSAGE, dvbg.class);
    }

    private dvbg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", dvbf.class, dvbb.class, dvbd.class});
        }
        if (ordinal == 3) {
            return new dvbg();
        }
        if (ordinal == 4) {
            return new dvaz();
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
        synchronized (dvbg.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbi extends eyfy implements eyht {
    public static final dvbi a;
    public static final eyfw b;
    private static volatile eyhz d;
    public duyr c;
    private int e;

    static {
        dvbi dvbiVar = new dvbi();
        a = dvbiVar;
        eyfy.registerDefaultInstance(dvbi.class, dvbiVar);
        b = eyfy.newSingularGeneratedExtension(dvay.a, dvbiVar, dvbiVar, null, 9003, eyjr.MESSAGE, dvbi.class);
    }

    private dvbi() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"e", "c"});
        }
        if (ordinal == 3) {
            return new dvbi();
        }
        if (ordinal == 4) {
            return new dvbh();
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
        synchronized (dvbi.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

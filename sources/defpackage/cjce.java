package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjce extends eyfy implements eyht {
    public static final cjce a;
    private static volatile eyhz d;
    public int b;
    public cjax c;
    private eyhm e = eyhm.a;

    static {
        cjce cjceVar = new cjce();
        a = cjceVar;
        eyfy.registerDefaultInstance(cjce.class, cjceVar);
    }

    private cjce() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"b", "c", "e", cjcd.a});
        }
        if (ordinal == 3) {
            return new cjce();
        }
        if (ordinal == 4) {
            return new cjcc();
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
        synchronized (cjce.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbf extends eyfy implements eyht {
    public static final cnbf a;
    private static volatile eyhz i;
    public int b;
    public String c = "";
    public String d = "";
    public cmrl e;
    public cmrs f;
    public int g;
    public cmry h;

    static {
        cnbf cnbfVar = new cnbf();
        a = cnbfVar;
        eyfy.registerDefaultInstance(cnbf.class, cnbfVar);
    }

    private cnbf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0006ဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new cnbf();
        }
        if (ordinal == 4) {
            return new cnbe();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = i;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cnbf.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqje extends eyfy implements eyht {
    public static final eqje a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";
    public long g;
    public long h;

    static {
        eqje eqjeVar = new eqje();
        a = eqjeVar;
        eyfy.registerDefaultInstance(eqje.class, eqjeVar);
    }

    private eqje() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eqju.a;
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e", eqjd.a, "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new eqje();
        }
        if (ordinal == 4) {
            return new eqjc();
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
        synchronized (eqje.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

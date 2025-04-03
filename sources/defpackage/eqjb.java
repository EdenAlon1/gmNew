package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqjb extends eyfy implements eyht {
    public static final eqjb a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f = "";
    public long g;
    public long h;

    static {
        eqjb eqjbVar = new eqjb();
        a = eqjbVar;
        eyfy.registerDefaultInstance(eqjb.class, eqjbVar);
    }

    private eqjb() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eqja.a;
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e", eqiz.a, "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new eqjb();
        }
        if (ordinal == 4) {
            return new eqiy();
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
        synchronized (eqjb.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

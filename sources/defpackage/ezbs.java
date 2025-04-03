package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezbs extends eyfy implements eyht {
    public static final ezbs a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public ezfe h;

    static {
        ezbs ezbsVar = new ezbs();
        a = ezbsVar;
        eyfy.registerDefaultInstance(ezbs.class, ezbsVar);
    }

    private ezbs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003᠌\u0002\u0005ဇ\u0004\u0006᠌\u0005\u0007ဉ\u0006", new Object[]{"b", "c", ezbq.a, "d", "e", ezbr.a, "f", "g", ezfb.a, "h"});
        }
        if (ordinal == 3) {
            return new ezbs();
        }
        if (ordinal == 4) {
            return new ezbp();
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
        synchronized (ezbs.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

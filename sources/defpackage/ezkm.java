package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezkm extends eyfy implements eyht {
    public static final ezkm a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;

    static {
        ezkm ezkmVar = new ezkm();
        a = ezkmVar;
        eyfy.registerDefaultInstance(ezkm.class, ezkmVar);
    }

    private ezkm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"b", "c", ezkj.a, "d", ezki.a, "e", ezkl.a, "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new ezkm();
        }
        if (ordinal == 4) {
            return new ezkk();
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
        synchronized (ezkm.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

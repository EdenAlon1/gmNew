package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoit extends eyfy implements eyht {
    public static final eoit a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public eoqx f;
    public eonc g;
    public String h = "";

    static {
        eoit eoitVar = new eoit();
        a = eoitVar;
        eyfy.registerDefaultInstance(eoit.class, eoitVar);
    }

    private eoit() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0007ဈ\u0006", new Object[]{"b", "c", fbqs.a, "d", eois.a, "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new eoit();
        }
        if (ordinal == 4) {
            return new eoir();
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
        synchronized (eoit.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

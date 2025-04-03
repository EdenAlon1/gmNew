package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erah extends eyfy implements eyht {
    public static final erah a;
    private static volatile eyhz i;
    public int b;
    public eqpc c;
    public eqpc d;
    public String e = "";
    public String f = "";
    public int g;
    public int h;

    static {
        erah erahVar = new erah();
        a = erahVar;
        eyfy.registerDefaultInstance(erah.class, erahVar);
    }

    private erah() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new erah();
        }
        if (ordinal == 4) {
            return new erag();
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
        synchronized (erah.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

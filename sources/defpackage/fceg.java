package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fceg extends eyfy implements eyht {
    public static final fceg a;
    private static volatile eyhz i;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h = "";

    static {
        fceg fcegVar = new fceg();
        a = fcegVar;
        eyfy.registerDefaultInstance(fceg.class, fcegVar);
    }

    private fceg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0007\u0000\u0000\u0003\n\u0007\u0000\u0000\u0000\u0003\u0004\u0004\u0004\u0005\u0004\u0007\f\b\f\t\f\nȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new fceg();
        }
        if (ordinal == 4) {
            return new fcef();
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
        synchronized (fceg.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

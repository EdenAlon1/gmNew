package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbsm extends eyfy implements eyht {
    public static final fbsm a;
    private static volatile eyhz i;
    public int b;
    public fbsk c;
    public int d;
    public int e;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        fbsm fbsmVar = new fbsm();
        a = fbsmVar;
        eyfy.registerDefaultInstance(fbsm.class, fbsmVar);
    }

    private fbsm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0006\u0000\u0001\u0001\r\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\n\f\u000bȈ\fȈ\rȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new fbsm();
        }
        if (ordinal == 4) {
            return new fbsl();
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
        synchronized (fbsm.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}

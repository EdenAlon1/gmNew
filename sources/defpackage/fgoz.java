package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgoz extends eyfy implements eyht {
    public static final fgoz a;
    private static volatile eyhz i;
    public int b;
    public long c;
    public boolean d;
    public int e;
    public int g;
    public String f = "";
    public String h = "";

    static {
        fgoz fgozVar = new fgoz();
        a = fgozVar;
        eyfy.registerDefaultInstance(fgoz.class, fgozVar);
    }

    private fgoz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (ordinal == 3) {
            return new fgoz();
        }
        if (ordinal == 4) {
            return new fgoy();
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
        synchronized (fgoz.class) {
            eyhzVar = i;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                i = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
